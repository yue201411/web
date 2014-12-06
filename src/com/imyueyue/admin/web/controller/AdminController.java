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

import com.imyueyue.common.Constants;
import com.imyueyue.common.pagination.Page;
import com.imyueyue.common.web.support.editor.DateEditor;
import com.imyueyue.demo.model.UserModel;
import com.imyueyue.demo.model.UserQueryModel;
import com.imyueyue.demo.service.UserService;


@Controller
@SessionAttributes(Constants.USERS)
public class AdminController {

    @Autowired
    @Qualifier("UserService")
    private UserService userService;
    
    
    @Value("#{themes['themes.layout']}")
    private String themes;
    

    @RequestMapping(value="/login",method={RequestMethod.GET})
    public String login(HttpServletRequest request,Model model){
    	 setCommonData(model,request);
    	 model.addAttribute(Constants.COMMAND, new UserModel());
         if (model.asMap().get(Constants.USERS)!=null)
         {
        	 return "redirect:/admin/index";
         }
        	 
    	return "admin/login";  
    }
    
    @RequestMapping(value="/login",method={RequestMethod.POST})
    public String login(String username,Model model, HttpServletRequest request){
      System.out.println(username);	
      try {
		String passwd= ServletRequestUtils.getStringParameter(request, "password");
		
		UserQueryModel u = new UserQueryModel();
		u.setUsername(username);
		u.setPassword(passwd);
		
		if (userService.checkUser(u)) 
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
    public String admin(HttpServletRequest request,Model model,HttpSession session){
    	return "redirect:/admin/index";
    }
    
    @RequestMapping(value="/admin/login",method={RequestMethod.GET})
    public String adminlogin(HttpServletRequest request,Model model,HttpSession session){
    	return "redirect:/admin/index";
    }
    
    
    @RequestMapping(value = "/admin/index", method = {RequestMethod.GET})
    public String list(HttpServletRequest request, Model model) {

    	UserModel u = (UserModel)request.getSession().getAttribute(Constants.USERS);
    	//System.out.println("session: "+u.getUsername());
    	
        setCommonData(model,request);
    
        model.addAttribute(Constants.COMMAND, u);

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

    @RequestMapping(value = "/admin/{action}", method = {RequestMethod.GET})
    public String settings(@PathVariable String action,HttpServletRequest request, Model model) {

    	UserModel u = (UserModel)request.getSession().getAttribute(Constants.USERS);
    	//System.out.println("session: "+u.getUsername());
    	
        setCommonData(model,request);
    
        model.addAttribute(Constants.COMMAND, u);
        
        model.addAttribute(action, "class='active'");

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
        
        if (action=="login") return "admin/index";
        if (action=="") return "admin/index";
        		
        
        return "admin/"+ action;
    }
    
    @RequestMapping(value = "/admin/top", method = {RequestMethod.GET})
    public String settings(HttpServletRequest request, Model model) {

    	UserModel u = (UserModel)request.getSession().getAttribute(Constants.USERS);
    	//System.out.println("session: "+u.getUsername());
    	
        setCommonData(model,request);
    
        model.addAttribute(Constants.COMMAND, u);

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
        return "admin/top";
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
