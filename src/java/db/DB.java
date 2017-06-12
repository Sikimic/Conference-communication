/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.Date;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import models.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author sikimic
 */
public class DB {
    private static Configuration cfg;
    private static ServiceRegistry serviceRegistry;
    public static SessionFactory factory;
    public static User user = null;
    
    static {
        cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(User.class);
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        factory = cfg.buildSessionFactory(serviceRegistry);
    }
}
