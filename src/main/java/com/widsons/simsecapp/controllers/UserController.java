/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.simsecapp.controllers;

import com.widsons.simsecapp.domains.CustomUser;
import com.widsons.simsecapp.services.CustomUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author fahmi
 */
@Controller
public class UserController {
    
    
    @RequestMapping(value = "/user/home")
    public String userHome(Model model){
        System.out.println("user name is " + SecurityContextHolder.getContext().getAuthentication().getName() +
                "with id "+SecurityContextHolder.getContext().getAuthentication().getPrincipal() );
        model.addAttribute("user_name", "test_user_email@email.com");
        return "home";
    }
    
}
