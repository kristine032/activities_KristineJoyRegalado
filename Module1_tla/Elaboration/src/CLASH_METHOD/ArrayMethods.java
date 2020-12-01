/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASH_METHOD;

import java.util.ArrayList;



/**
 *
 * @author TinTin
 */
public class ArrayMethods {
    
   public ArrayList <String> arrsList (String [] array){
      
       ArrayList <String> newArray = new ArrayList <>();
       
       for (int i = 0; i < array.length; i++) {
           newArray.add(array[i]);
       }
       
       
     
       return newArray;
       
       
   }
          
    
    
}
