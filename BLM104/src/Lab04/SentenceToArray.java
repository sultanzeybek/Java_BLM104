/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

/**
 *
 * @author szeybek
 */
public class SentenceToArray {
    public static void main(String[] args) {
        String s="Fatih Sultan Mehmet V Ü";
        char[] c=new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            c[i]=s.charAt(i);
        }
        
        System.out.println(c);
        
    }
}
