package com.imyueyue.demo.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.imyueyue.common.Constants;


/**
 * @author imyueyue
 * @version 1.0
 */
@Controller("indexController")
@SessionAttributes(Constants.USERS)
public class IndexController {
    
    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request,Model model){
        model.addAttribute("themes","default"); 	 
    	return "index";
    }

}
