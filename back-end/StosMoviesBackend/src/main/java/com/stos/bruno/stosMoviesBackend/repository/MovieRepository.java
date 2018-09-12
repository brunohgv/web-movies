/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stos.bruno.stosMoviesBackend.repository;

import com.stos.bruno.stosMoviesBackend.model.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bruno
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, String>{
}
