/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stos.bruno.stosMoviesBackend.model.dto;

/**
 *
 * @author bruno
 */
public class MovieDTO {
    
    private String id;
    
    private String title;
    private String description;
    private String cover;
    private String imageUrl;

    public MovieDTO () {
        
    }
    
    public MovieDTO(String title, String description, String cover, String imageUrl) {
        this.title = title;
        this.description = description;
        this.cover = cover;
        this.imageUrl = imageUrl;
    }         
    
    
}
