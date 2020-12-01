/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleAssessments;

import java.util.Random;

/**
 *
 * @author TinTin
 */
public class assessment3 {
    public static void main(String[] args) {
                int[]  arr = new int [5];
        
        Random rand = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = rand.nextInt(101);
      } 
        
       float sum = 0;
       float avg = 0;
       
        for (int i = 0; i < arr.length; i++) {
            
            sum = sum + arr[i];
            avg = sum / arr.length;
            System.out.println(arr[i]);
            
        } System.out.println("Total average: "+avg);
    }
}
