/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.simsecapp.services;

import com.widsons.simsecapp.domains.CustomUser;
import com.widsons.simsecapp.domains.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author fahmi
 */
@Service
public class CustomUserDetailService implements UserDetailsService{

    @Autowired
    UserAccountService userAccountService;
    
    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
        UserAccount userAccount = userAccountService.findByEmail(string)
                .orElseThrow(()-> new UsernameNotFoundException(String.format("User with email =%s not found", string)));
        
        return new CustomUser(userAccount);
    }
    
}
