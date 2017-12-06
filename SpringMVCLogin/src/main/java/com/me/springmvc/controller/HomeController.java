package com.me.springmvc.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.me.springmvc.model.LoginInfo;


@Controller
public class HomeController{
	
	@RequestMapping(value = "/", method= RequestMethod.GET)
	public String home(ModelMap model) {
		
		model.addAttribute("login_info", new LoginInfo("", ""));
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginProcess(ModelMap model, @Valid LoginInfo loginInfo, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/";
		}
		return "file-view";
	}
	
}
