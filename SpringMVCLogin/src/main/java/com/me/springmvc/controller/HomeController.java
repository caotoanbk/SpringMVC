package com.me.springmvc.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import javax.validation.Valid;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.me.springmvc.dao.UserDAOImpl;
import com.me.springmvc.model.LoginInfo;
import com.me.springmvc.model.User;

@Controller
public class HomeController {
	
	@Autowired
	UserDAOImpl userDAOImpl;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(ModelMap model) {

		model.addAttribute("login_info", new LoginInfo("", ""));
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginProcess(ModelMap model) {
		/*
		 * if (result.hasErrors()) { return "redirect:/"; }
		 */
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("user-info.txt"));
			obj = parser.parse(new InputStreamReader(new FileInputStream("user-info.txt"), "UTF-8"));

			JSONObject jsonObject = (JSONObject) obj;
			long id = Long.parseLong((String) jsonObject.get("id"));
			String first_name = (String) jsonObject.get("first_name");
			String last_name = (String) jsonObject.get("last_name");
			String email = (String) jsonObject.get("email");
			String gender = (String) jsonObject.get("gender");
			String birthday = (String) jsonObject.get("birthday");
			String education = (String) jsonObject.get("education");

			User user = new User(id, first_name, last_name, email, gender, birthday, education);
			model.addAttribute("user", user);
			return "file-view";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Error500";

	}

}
