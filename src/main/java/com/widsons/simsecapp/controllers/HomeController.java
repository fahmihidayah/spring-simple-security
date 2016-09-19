/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.simsecapp.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author fahmi
 */
@Controller
public class HomeController {
       
    @RequestMapping(name = "/")
    public String index(){
        return "index";
    }
    
    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView modelAndView){
        modelAndView.setViewName("login");
        return modelAndView;
    }
    
//    @RequestMapping(name = "/user/welcome")
//    public String welcome(){
//        return "home";
//    }
//    
//    @RequestMapping(name = "/login")
//    public String login(){
//        return "login";
//    }
}
