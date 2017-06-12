/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import db.services.LoginService;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import models.User;

/**
 *
 * @author sikimic
 */

@ViewScoped
@ManagedBean(name = "loginController")
public class LoginController implements Serializable {
    @ManagedProperty(value = "#{user}")
    private User user;
    
    private String username;
    private String password;
    
    private String message;
    //==========================================================================
    
    
    public String login(){

        if(username==null || password==null)
            return null;
        
        if(username.equals("") || password.equals("")){
            message = "Please enter a username and a password";
            return null;
        }
        
        user = LoginService.login(username,password);
        
        if(user == null){
            message = "Failed to log in.";
            return null;
        }
        
        message = "Successfully logged in!";
       
        switch(user.getRole().getName()){
            case "admin":
                return "home_admin";
            case "regular": 
                return "home_registered";
            case "moderator": 
                return "home_moderator";
            default: 
                return "home_unregistered";
        }
    }
    
  

    
    //==========================================================================
    
    public LoginController(){
        user = new User();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        
        this.message = message;
    }

    public User getuser() {
        return user;
    }

    public void setuser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
    
    
    
}
