/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.services;

import static db.DB.factory;
import models.User;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author sikimic
 */
public class RegisterService {
    public static Boolean register(User user) {
        Session session = factory.openSession();
        Query query = session.getNamedQuery("User.findByUsername").setString("username", user.getUsername());
        User resultUser = (User)query.uniqueResult();
        if(resultUser!=null){
            session.close();
            return false;
        }
        session.getTransaction().begin();
        session.save(user);
        if(!session.getTransaction().wasCommitted()) session.getTransaction().commit();
        session.close();
        return true;
    }
}
