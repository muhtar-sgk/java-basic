/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsyntax;

/**
 *
 * @author Muhtar
 */
public class Fruit {
    public String nameFruit;
    //call method constructor
    public Fruit(String nameFruit){
        System.out.println("my favourite fruit is "+nameFruit);
    }
    
    public Fruit(){
    }
    
    public void warna(String strWarna){
        System.out.println("Warna kamu adalah "+strWarna);
    }
    
    public void strawberry(){
        System.out.println("my favourite fruit is strawberry");
    }
    
    public String orange(){
        nameFruit = "orange";
        System.err.println("my favourite fruit is "+nameFruit);
        return nameFruit;
    }
    
}
