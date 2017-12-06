package com.me.springmvc.controller;
  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;

import com.me.springmvc.dao.UserDAOImpl;
import com.me.springmvc.model.User; 
@Controller  
public class UserController {  
    @Autowired  
    UserDAOImpl userDAOImpl;//will inject dao from xml file  
      
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
    @RequestMapping("/user/addform")  
    public ModelAndView showform(){  
        return new ModelAndView("user/addform","command",new User());  
    }  
    /*It saves object into database. The @ModelAttribute puts request data 
     *  into model object. You need to mention RequestMethod.POST method  
     *  because default request is GET*/  
    @RequestMapping(value="/user/save",method = RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute("user") User user){  
    	userDAOImpl.save(user);  
        return new ModelAndView("redirect:/viewusers");//will redirect to viewemp request mapping  
    }  
    /* It provides list of employees in model object */  
    @RequestMapping("/view/users")  
    public ModelAndView viewemp(){  
        List<User> list=userDAOImpl.getUsers();  
        return new ModelAndView("viewusers","list",list);  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/user/edit/{id}")  
    public ModelAndView edit(@PathVariable int id){  
        User user=userDAOImpl.getUserById(id);  
        return new ModelAndView("/user/editform","command",user);  
    }  

  
}  