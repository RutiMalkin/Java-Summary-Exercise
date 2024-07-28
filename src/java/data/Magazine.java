/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author huser
 */
@Entity
@DiscriminatorValue("m")
public class Magazine extends Item{
 
    private int year_;

    public int getYear() {
        return year_;
    }

    public void setYear(int year) {
        this.year_ = year;
    }
    
}
