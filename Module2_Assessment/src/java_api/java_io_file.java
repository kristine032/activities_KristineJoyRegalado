/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_api;

import java.io.File;

/**
 *
 * @author TinTin
 */
public class java_io_file {
   public static void main(String[] args) {
      File myfile = new File ("C:\\Users\\TinTin\\Pictures");
        
        String [] files = myfile.list();
        
        for (int i = 0; i < files.length; i++) {
     
        System.out.println(files[i]);
        }
    } 
}
