/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.takemyeys.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.takemyeys.model.User;
/**
 *
 * @author Tunux
 */
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
