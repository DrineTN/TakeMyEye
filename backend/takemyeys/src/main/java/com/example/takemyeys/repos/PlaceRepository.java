/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.takemyeys.repos;

import com.example.takemyeys.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Tunux
 */
public interface PlaceRepository extends JpaRepository<Place, Integer>{
    
}
