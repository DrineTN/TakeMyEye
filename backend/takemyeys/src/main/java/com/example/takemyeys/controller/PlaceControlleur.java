/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.takemyeys.controller;

import com.example.takemyeys.model.Place;
import com.example.takemyeys.repos.PlaceRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceControlleur {
    @Autowired
    PlaceRepository placeRepository;
    
    @GetMapping(value="/photos", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Place> getAll() {
        List<Place> photos = new ArrayList<Place>();
        Iterable<Place> itphotos = placeRepository.findAll();
        itphotos.forEach(photos::add);
        return photos;
    }
}
