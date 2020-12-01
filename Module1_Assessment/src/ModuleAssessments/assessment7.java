/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleAssessments;

import java.io.File;

/**
 *
 * @author TinTin
 */
public class assessment7 {
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\TinTin\\Desktop");
        String[] array = file.list();
        
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("" + array[i]);
        }
        
    }
}
