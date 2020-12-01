/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_api;

import java.util.ArrayList;

/**
 *
 * @author TinTin
 */
public class java_util {
    public static void main(String[] args) {
        
       ArrayList <Object> arrylist = new ArrayList <> ();  
        
       arrylist.add("tin");
       arrylist.add("lee");
       arrylist.add("min");
       arrylist.add("ho");

       
        for (int i = 0; i < arrylist.size(); i++) {
            System.out.println(arrylist.get(i));
        }

       
    }
}
