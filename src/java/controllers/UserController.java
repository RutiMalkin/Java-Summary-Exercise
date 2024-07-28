/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import data.Book;
import data.Borrow;
import data.NewHibernateUtil;
import data.User_;
import java.util.Date;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author huser
 */
public class UserController extends AppController{

    @Path("/post")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addUser_(User_ u) {
        session.save(u);
        trc.commit();
        return "the user save succefull";
    }
    public User_ getById(int id){
        return (User_)session.get(User_.class, id);
    }
    
        public User_ isCorrect(String name , String password) {
        User_ u = (User_) session.getNamedQuery("login.getUser").setParameter("userName", name).list().stream().findFirst().get();
                if(u!=null && u.getPassword().equals(password))
                    return u;
        return null;
 
    }
}
