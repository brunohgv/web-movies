/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stos.bruno.stosMoviesBackend.service.implementation;

import com.stos.bruno.stosMoviesBackend.model.dto.MovieDTO;
import com.stos.bruno.stosMoviesBackend.model.entity.Movie;
import com.stos.bruno.stosMoviesBackend.repository.MovieRepository;
import com.stos.bruno.stosMoviesBackend.service.MovieService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bruno
 */
@Service
public class MovieServiceImplementation implements MovieService{
    
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAll() {
        List<Movie> movies;
        movies = movieRepository.findAll();
        return movies;
    }

    @Override
    public Optional<Movie> getById(String id) {
        Optional<Movie> movie;
        movie = movieRepository.findById(id);
        return movie;
    }

    @Override
    public void save(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void deleteById(String id) {
        movieRepository.deleteById(id);
    }
    
}
