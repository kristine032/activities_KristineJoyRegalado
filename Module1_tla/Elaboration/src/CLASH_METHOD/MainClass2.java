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
public class MainClass2 {
    public static void main(String[] args) {
        
         ArrayMethods methods = new ArrayMethods();
      
         ArrayList <String> arrs = new ArrayList<>();
      
         String [] String = new String [4];
        
        String[0]= "a";
        String[1]= "b";
        String[2]= "c";
        String[3]= "d";
     
         arrs =  methods.arrsList(String);
        
         for (int i = 0; i < arrs.size(); i++) {
            
             System.out.println(arrs.get(i));
        }
       
        
    }
}
