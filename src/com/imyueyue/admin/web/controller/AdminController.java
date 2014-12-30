package com.imyueyue.admin.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.imyueyue.admin.model.ChannelsModel;
import com.imyueyue.admin.model.UsersModel;
import com.imyueyue.admin.model.UsersQueryModel;
import com.imyueyue.admin.service.ChannelsService;
import com.imyueyue.admin.service.UsersService;
import com.imyueyue.common.Constants;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.web.support.editor.DateEditor;
import com.imyueyue.demo.model.UserModel;


@Controller
@SessionAttributes(Constants.USERS)
public class AdminController {

    @Autowired
    @Qualifier("UsersService")
    private UsersService usersService;
    
    @Autowired
    @Qualifier("ChannelsService")
    private ChannelsService channelsService;
    
    
    @Value("#{themes['themes.layout']}")
    private String themes;
    

    @RequestMapping(value="/login",method={RequestMethod.GET})
    public String login(HttpServletRequest request,Model model){
    	 UsersModel u = (UsersModel)request.getSession().getAttribute(Constants.USERS);
    	 setCommonData(model,request);
    	 
    	 if (u!=null)
         {
    		 model.addAttribute(Constants.COMMAND, u);
        	 
    		 return "redirect:/admin/index";
         }
        
    	 model.addAttribute(Constants.COMMAND, new UserModel());
    	  
    	return "admin/login";  
    }
    
    @RequestMapping(value="/login",method={RequestMethod.POST})
    public String login(String username,Model model, HttpServletRequest request){
      System.out.println(username);	
      try {
		String passwd= ServletRequestUtils.getStringParameter(request, "password");
		
		UsersQueryModel u = new UsersQueryModel();
		u.setUserName(username);
		u.setPassword(passwd);
		
		if (usersService.checkUser(u)) 
		{
	      model.addAttribute(Constants.USERS,u);	

		}
		else
		{
		  System.out.println("错误");	
		  model.addAttribute("errors", "错误");
	      return login(request,model);   
		}
		
      } catch (ServletRequestBindingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
      
  
      return "redirect:/admin/index";
    }
      
    @RequestMapping(value="/logout",method={RequestMethod.GET})
    public String logout(HttpServletRequest request,Model model,HttpSession session){
    	
    	// setCommonData(model,request);
        // model.addAttribute(Constants.COMMAND, new UserModel());
    	 session.invalidate(); //释放session
         model.asMap().remove(Constants.USERS);
    	return "redirect:/login";
    }
    
    @RequestMapping(value="/admin",method={RequestMethod.GET})
    public String admin(HttpServletRequest request,Model model){
    	 setCommonData(model,request);
    	 System.out.println(model.asMap().get(Constants.USERS));
    	
    	 UsersModel u = (UsersModel)request.getSession().getAttribute(Constants.USERS);
    	 model.addAttribute(Constants.USERS, u);
    	 
    	if (u.getUserName()!=null)
        {
    	    return "redirect:/admin/index";
        }
    
    	return "admin/login";	
    }
    
    @RequestMapping(value="/admin/login",method={RequestMethod.GET})
    public String adminlogin(HttpServletRequest request,Model model){
    	 setCommonData(model,request);
    	 model.addAttribute(Constants.USERS, new UsersModel());
    	if (model.asMap().get(Constants.USERS)!=null)
        {	
    	   return "redirect:/admin/index";
        }

    	
        return "admin/login";	
    }
    
    
    @RequestMapping(value = "/admin/index", method = {RequestMethod.GET})
    public String list(HttpServletRequest request, Model model) {
    	
    	UsersModel u = (UsersModel)request.getSession().getAttribute(Constants.USERS);
        
        setCommonData(model,request);
    	
        model.addAttribute(Constants.USERS, u);
        
        model.addAttribute("index", "class='active'");
        /*int pn = ServletRequestUtils.getIntParameter(request, "pn", 1);
        Integer id = ServletRequestUtils.getIntParameter(request, "id", -1);
        boolean pre = ServletRequestUtils.getBooleanParameter(request, "pre", false);
        Page<UserModel> page = null;
        if(id > 0) {
            if(pre) {
                page = userService.pre(id, pn);
            }
            else {
                page = userService.next(id, pn);
            }
        } 
        else {
            page = userService.listAll(pn);
        }
        request.setAttribute("page", page);
       */
        return "admin/list";
    }

      
    @RequestMapping(value = "/admin/projects", method = {RequestMethod.GET})
    public String projects(HttpServletRequest request, Model model) {

    	UsersModel u = (UsersModel)request.getSession().getAttribute(Constants.USERS);
    	//System.out.println("session: "+u.getUsername());
    	
        setCommonData(model,request);
    
        model.addAttribute(Constants.USERS, u);
        
        model.addAttribute(Constants.COMMAND, new ChannelsModel());
        
        model.addAttribute("projects", "class='active'");

        int pn = ServletRequestUtils.getIntParameter(request, "pn", 1);
        Integer id = ServletRequestUtils.getIntParameter(request, "id", -1);
        boolean pre = ServletRequestUtils.getBooleanParameter(request, "pre", false);
        Page<ChannelsModel> page = null;
        if(id > 0) {
            if(pre) {
                page = channelsService.pre(id, pn);
            }
            else {
                page = channelsService.next(id, pn);
            }
        } 
        else {
            page = channelsService.listAll(pn);
        }
        request.setAttribute("page", page);
     
        return "admin/projects";
    }
    
    @RequestMapping(value = "/admin/projects", method = {RequestMethod.POST})
    public String addProjects(HttpServletRequest request,Model model, @ModelAttribute("command") @Valid ChannelsModel command, BindingResult result) {
        
        if(result.hasErrors()) {
            model.addAttribute(Constants.COMMAND, command);
            return projects(request,model);
        }
        channelsService.save(command);
        return "redirect:/admin/projects";
    }
    
    @RequestMapping(value = "/admin/settings", method = {RequestMethod.GET})
    public String settings(HttpServletRequest request, Model model) {

    	UsersModel u = (UsersModel)request.getSession().getAttribute(Constants.USERS);
    	//System.out.println("session: "+u.getUsername());
    	
        setCommonData(model,request);
    
        model.addAttribute(Constants.USERS, u);
        
        model.addAttribute(Constants.COMMAND, new ChannelsModel());
        model.addAttribute("settings", "class='active'");
        

        int pn = ServletRequestUtils.getIntParameter(request, "pn", 1);
        Integer id = ServletRequestUtils.getIntParameter(request, "id", -1);
        boolean pre = ServletRequestUtils.getBooleanParameter(request, "pre", false);
        Page<ChannelsModel> page = null;
        if(id > 0) {
            if(pre) {
                page = channelsService.pre(id, pn);
            }
            else {
                page = channelsService.next(id, pn);
            }
        } 
        else {
            page = channelsService.listAll(pn);
        }
        request.setAttribute("page", page);
     
        return "admin/settings";
    }
    
    
    
    
    
    private void setCommonData(Model model,HttpServletRequest request) {
        //设置通用属性
    	 model.addAttribute(Constants.THEMES,themes); 
    	 
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new DateEditor());
    }
  
    
}
