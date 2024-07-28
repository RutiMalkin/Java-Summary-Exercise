/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import data.NewHibernateUtil;
import data.User_;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import static jdk.nashorn.internal.runtime.Debug.id;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author huser
 */
public class LoginController extends AppController{


    public boolean getUser(User_ u) {
    
        User_ uu = (User_) session.get(User_.class, u.getId());
        session.close();
        if(uu.getPassword() == u.getPassword()&&uu.getUserName()==u.getUserName())
        {
               return true;

        }
        return false;
    }
}
   
        
