/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModuleAssessments;

/**
 *
 * @author TinTin
 */
public class assessment2 {
    public static void main(String[] args) {
        
        String[][] array = new String[10][10];
        
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                array[i][a] = " @";
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                System.out.print(array[i][a]);
            }
            System.out.println("");
        }
        
    }  
}
