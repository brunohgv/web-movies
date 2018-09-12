/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stos.bruno.stosMoviesBackend.controller;

import com.stos.bruno.stosMoviesBackend.model.entity.Movie;
import com.stos.bruno.stosMoviesBackend.service.MovieService;
import com.stos.bruno.stosMoviesBackend.util.Response;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bruno
 */
@RestController
@RequestMapping(value = "/movies")
@CrossOrigin(origins = "*")
public class MovieController {
    
    @Autowired
    MovieService movieService;
    
    @GetMapping("/all")
    public ResponseEntity<Response<List<Movie>>> getAll() {
        
        Response<List<Movie>> response = new Response<List<Movie>>();
        List<Movie> movies = this.movieService.getAll();
        response.setData(movies);
        return ResponseEntity.ok(response);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Response<Movie>> getById(@PathVariable("id") String id) {
        Response<Movie> response = new Response<>();
        try{
            Optional<Movie> movie = this.movieService.getById(id);
            if(movie.get() != null) {
                response.setData(movie.get());
            }
        } catch (NullPointerException e) {
            response.getErrors().add("Register not found for id: " + id);
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }
    
    @PostMapping("/save")
    public ResponseEntity<Response<Movie>> save(@Valid @RequestBody Movie movie){
        Response<Movie> response = new Response<>();
        
        try{
            this.movieService.save(movie);
            response.setData(movie);
        } catch(Exception e){
            response.getErrors().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Response<Movie>> deleteById(@PathVariable String id) {
        Response<Movie> response = new Response<>();
        Optional<Movie> movie = this.movieService.getById(id);
        
        if(movie.get() == null){
            response.getErrors().add("Resgister not found for id: " + id);
            return ResponseEntity.badRequest().body(response);
        }
        this.movieService.deleteById(movie.get().getId());
        response.setData(movie.get());
        return ResponseEntity.ok(response);
    }
}
