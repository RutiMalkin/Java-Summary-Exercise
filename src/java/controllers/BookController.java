
package controllers;

import data.Book;
import data.Item;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huser
 */
public class BookController extends AppController{
    
    @Path("/post")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addBook_(Book b) {
        session.save(b);
        trc.commit();
        return "the user save succefull";
}
    public Item getById(int id){
        return (Item)session.get(Item.class, id);
    }
    
}
