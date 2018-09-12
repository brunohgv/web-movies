/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stos.bruno.stosMoviesBackend.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author bruno
 */
@Data
@Document(collection = "Movies")
public class Movie {
    
    @Id
    private String id;
    
    private String title;
    private String description;
    private String cover;
    private String imageUrl;

    public Movie () {
        
    }
    
    public Movie(String title, String description, String cover, String imageUrl) {
        this.title = title;
        this.description = description;
        this.cover = cover;
        this.imageUrl = imageUrl;
    }         
    
}
