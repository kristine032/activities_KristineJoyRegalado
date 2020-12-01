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
public class assessment5 {
    public static void main(String[] args) {
        
        String txt = "the quick brown fox";
        for (int i =0; i < txt.length(); i++){
         
            if (txt.charAt(i)!= ' ' && txt.charAt(i) != 'q'&& txt.charAt(i) != 'u'
                    && txt.charAt(i) != 'e'&& txt.charAt(i) != 'e'&& txt.charAt(i) != 'n'){
             
                System.out.print(txt.charAt(i));
        
               
                }
               
            }
        }
}
