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
public class assessment1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = new int[5];
        
        array[0] = 16;
        array[1] = 32;
        array[2] = 1;
        array[3] = 6;
        array[4] = 2;

        
        
        arraycopy(array, 0, array1, 0, 5);
        
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        
    }
    
    public static void arraycopy(int[] from,int fromstart, int[] to, int tostart, int count) {
        for (int i = 0; i < count; i++) {
            to[tostart + i] = from[fromstart + i];
        }
    }
}
