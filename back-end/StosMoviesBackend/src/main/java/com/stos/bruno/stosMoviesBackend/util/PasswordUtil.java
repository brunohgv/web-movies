/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stos.bruno.stosMoviesBackend.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author bruno
 */
public class PasswordUtil {
    
    public static String generateBCrypt(String password){
        if (password != null) {
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            return bCryptPasswordEncoder.encode(password);
        }
        return null;
    }
    
    public static boolean validPassword(String password, String passwordEncoder) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.matches(password, passwordEncoder);
    }
    
}
