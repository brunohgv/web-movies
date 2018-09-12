/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stos.bruno.stosMoviesBackend.service;

import com.stos.bruno.stosMoviesBackend.model.entity.Movie;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author bruno
 */
@Service
public interface MovieService {
    public List<Movie> getAll();
    public Optional<Movie> getById(String id);
    public void save(Movie movie);
    public void deleteById(String id);
}
