/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author huser
 */

@Entity
public class Borrow {
    
    @Id
    private int borrowId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id",referencedColumnName="id")    
    private User_ id;
    
    private int book;
    private Date borrowDate; 

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public User_ getId() {
        return id;
    }

    public void setId(User_ id) {
        this.id = id;
    }

    

    public int getBook() {
        return book;
    }

    public void setBook(int book) {
        this.book = book;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }
    
    
    

    
}
