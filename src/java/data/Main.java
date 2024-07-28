/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author huser
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        User_ u = new User_();
        u.setId(1);
        u.setName("rut");
        u.setBookId(20);

        Book b=new Book();
        b.setID(1);
        b.setName("myBook");
        b.setCategory(Categories.ADOULT);
        
        Magazine m=new Magazine();
        m.setID(1);
        m.setName("myMagazine");
        m.setYear(2024);
        
        Borrow br = new Borrow();
        br.setBook(b.getID());
        br.setBorrowId(0);
        br.setId(u);
        
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trc = session.beginTransaction();
        session.save(br);

        trc.commit();
        User_ uu = (User_) session.get(User_.class, 1);
        System.out.println("user---"+uu.getName());
        session.close();
    }
    
    
    
}
