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
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author huser
 */
public class BorrowController {

    @Path("/post")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public static String addBorrowBook(User_ c, Book b) {
        Date d = new Date();
        Borrow borrow = new Borrow();
        borrow.setBook(b.getID());
        borrow.setBorrowDate(new Date());
        borrow.setBorrowId(1);
        borrow.setId(c);

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trn = session.beginTransaction();
        session.save(borrow);
        return "the book borrowed succefull";
    }

    @Path("/delete/{id}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public static String deletedBorrowBook(@PathParam("id") int id, User_ c) {
        Date d = new Date();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trn = session.beginTransaction();

//         session.delete();
        return "the book deletede succefull";
    }
}
