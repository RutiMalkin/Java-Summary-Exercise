package data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author huser
 */
@Entity
@DiscriminatorValue("b")
public class Book extends Item{
  
    private Categories Category;

   @Enumerated(EnumType.STRING)
    public Categories getCategory() {
        return Category;
    }

    public void setCategory(Categories Category) {
        this.Category = Category;
    }
    
}
