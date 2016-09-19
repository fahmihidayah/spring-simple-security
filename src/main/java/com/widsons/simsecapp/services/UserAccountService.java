/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.simsecapp.services;

import com.widsons.simsecapp.domains.UserAccount;
import com.widsons.simsecapp.repositories.UserAccountRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fahmi
 */
@Service
public class UserAccountService {

    @Autowired
    UserAccountRepository userAccountRepository;
    
    public Optional<UserAccount> findByEmail(String email){
        return userAccountRepository.findOneByEmail(email);
    }
}
