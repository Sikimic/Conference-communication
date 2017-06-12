/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import models.User;

/**
 *
 * @author sikimic
 */
@ViewScoped
@ManagedBean(name = "registerController")
public class RegisterController {
    @ManagedProperty(value = "#{user}")
    private User user;
    private String message;
    private String password;

    public String register() {
        message = "";
        if (user.getUsername().equals("")) {
            message += "You must required fields";
        }
        if (!message.equals("")) {
            return "";
        }
        return "login.xhtml";
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
