/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.services;

import static db.DB.factory;
import static db.DB.user;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import models.User;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author sikimic
 */
public class LoginService {
    public static User login(String username, String password){
        Session session = factory.openSession();
        Query query = session.getNamedQuery("User.findByUsername").setString("username", username);
        User resultUser = (User)query.uniqueResult();
        
        
        return resultUser;
    }
    
    public static void logout() {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        session.invalidate();
        user = null;
    }
}
