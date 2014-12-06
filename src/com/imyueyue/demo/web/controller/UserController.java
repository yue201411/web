package com.imyueyue.demo.web.controller;

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
public class UserController {

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
        	 return "redirect:/user";
         }
        	 
    	return "user/login";
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
      
  
      return "redirect:/user";
    }
      
    @RequestMapping(value="/logout",method={RequestMethod.GET})
    public String logout(HttpServletRequest request,Model model,HttpSession session){
    	
    	// setCommonData(model,request);
        // model.addAttribute(Constants.COMMAND, new UserModel());
    	 session.invalidate(); //释放session
         model.asMap().remove(Constants.USERS);
    	return "redirect:/login";
    }
    
    @RequestMapping(value = "/user", method = {RequestMethod.GET})
    public String list(HttpServletRequest request, Model model) {

    	UserModel u = (UserModel)request.getSession().getAttribute(Constants.USERS);
    	System.out.println("session: "+u.getPassword());
    	
        setCommonData(model,request);
        model.addAttribute(Constants.COMMAND, new UserModel());

        int pn = ServletRequestUtils.getIntParameter(request, "pn", 1);
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
       
        return "user/list";
    }



    @RequestMapping(value = "/user/query", method = {RequestMethod.GET})
    public String query(HttpServletRequest request, Model model, @ModelAttribute("command") UserQueryModel command) {
        setCommonData(model,request);
        model.addAttribute(Constants.COMMAND, command);
        int pn = ServletRequestUtils.getIntParameter(request, "pn", 1);
        model.addAttribute("page", userService.query(pn, Constants.DEFAULT_PAGE_SIZE, command));

        return "user/list";
    }


    private void setCommonData(Model model,HttpServletRequest request) {
        //设置通用属性
    	 model.addAttribute(Constants.THEMES,themes); 
         
    }

    @RequestMapping(value="/user/{id}/view", method = {RequestMethod.GET})
    public String view(@PathVariable Integer id,Model model,  HttpServletRequest request) {
    	 setCommonData(model,request);
    	request.setAttribute(Constants.COMMAND, userService.get(id));
        return "user/view";
    }



    
    @RequestMapping(value = "/user/add", method = {RequestMethod.GET})
    public String toAdd(Model model,HttpServletRequest request) {
        
        if(!model.containsAttribute(Constants.COMMAND)) {
            model.addAttribute(Constants.COMMAND, new UserModel());
        }
        setCommonData(model,request);
        return "user/add";
    }
    
    @RequestMapping(value = "/user/{id}/update", method = {RequestMethod.GET})
    public String toUpdate(Model model, @PathVariable Integer id,HttpServletRequest request) {
        if(!model.containsAttribute(Constants.COMMAND)) {
            model.addAttribute(Constants.COMMAND,  userService.get(id));
        }
        setCommonData(model,request);
        return "user/update";
    }
    
    @RequestMapping(value = "/user/{id}/delete", method = {RequestMethod.GET})
    public String toDelete(HttpServletRequest request,@PathVariable Integer  id,Model model) {
    	setCommonData(model,request);
        return "user/delete";
    }


    @RequestMapping(value = "/user/add", method = {RequestMethod.POST})
    public String add(HttpServletRequest request,Model model, @ModelAttribute("command") @Valid UserModel command, BindingResult result) {
        
        //如果有验证错误 返回到form页面
        if(result.hasErrors()) {
            model.addAttribute(Constants.COMMAND, command);
            return toAdd(model,request);
        }
         userService.save(command);
        return "redirect:/user/success";
    }
    
    @RequestMapping(value = "/user/{id}/update", method = {RequestMethod.POST})
    public String update(HttpServletRequest request,Model model, @ModelAttribute("command") @Valid UserModel command, BindingResult result) {
        if(result.hasErrors()) {
            model.addAttribute(Constants.COMMAND, command);
            return toUpdate(model, command.getId(),request);
        }
        userService.update(command);
        return "redirect:/user/success";
    }
    
    @RequestMapping(value = "/user/{id}/delete", method = {RequestMethod.DELETE})
    public String delete(@PathVariable Integer id) {
        userService.delete(id);
        return "redirect:/user/success";
    }
    
    @RequestMapping(value = "/user/success", method = {RequestMethod.GET})
    public String success() {
        return "user/success";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new DateEditor());
    }
  
    
}
