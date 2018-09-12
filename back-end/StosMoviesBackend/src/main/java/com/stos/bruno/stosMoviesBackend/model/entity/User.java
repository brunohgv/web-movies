/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stos.bruno.stosMoviesBackend.model.entity;

import com.stos.bruno.stosMoviesBackend.util.PasswordUtil;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author bruno
 */
@Data
@Document(collection = "Users")
public class User {
    
    @Id
    @Generated
    private String id;
    
    private String login;
    private String encryptedPassword;

    public User(String login, String encryptedPassword) {
        this.login = login;
        this.encryptedPassword = PasswordUtil.generateBCrypt(encryptedPassword);
    }
    
}
