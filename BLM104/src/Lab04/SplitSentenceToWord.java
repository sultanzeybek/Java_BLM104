/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

import java.util.ArrayList;

/**
 *
 * @author szeybek
 */
public class SplitSentenceToWord {
    public static void main(String[] args) {
        String s="Fatih Sultan Mehmet V U ";
        int kelimeBasi=0;
        int kelimeSonu=s.indexOf(" ");
        
        while(kelimeBasi<s.length()){
            System.out.println(s.substring(kelimeBasi,kelimeSonu));
            kelimeBasi=kelimeSonu+1;
            kelimeSonu=s.indexOf(" ",kelimeBasi);
           // System.out.println(kelimeBasi);
        }
        System.out.println("-----------------");
        ArrayList<String> kelimeler=new ArrayList();
        String kelime="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                kelimeler.add(kelime);
                System.out.println("");
                kelime="";
            }
            else{
                kelime+=s.charAt(i);
                System.out.print(s.charAt(i));
            }
        }
        System.out.println(kelimeler);
        
        char [] karakter_dizisi = new char[s.length()];
        
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)== ' '){
                System.out.println(s.substring(i,s.indexOf(" ", i+1)));  
            }
            karakter_dizisi[i] = s.charAt(i);
        }
        
        
        
        
    }
}
