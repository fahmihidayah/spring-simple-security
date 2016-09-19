/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.widsons.simsecapp.repositories;

import com.widsons.simsecapp.domains.UserAccount;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fahmi
 */
@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long>{
    
    public Optional<UserAccount> findOneByEmail(String email);
    
}
