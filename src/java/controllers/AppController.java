/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import data.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author huser
 */
public class AppController {

    
    Session session = NewHibernateUtil.getSessionFactory().openSession();
    Transaction trc = session.beginTransaction();
    
}
