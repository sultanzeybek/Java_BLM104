/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

/**
 *
 * @author szeybek
 * 
Input: 123456789101112131516
Output: 
1
23
456
7891
01112
131415
 * 
 * 
 * 
 */
public class StringFigures {
    public static void main(String[] args) {
        StringPattern("123456789101112131516");
        
    }
    
    static void StringPattern(String myString){
        int step=1;
        String s = myString;
        while (s.length() > 0) {
            for (int i = 0; i < step; i++) {
                System.out.print(s.charAt(i));       
            }
            System.out.println("");
            s= s.substring(step);
            step++;
        }

    }
}
