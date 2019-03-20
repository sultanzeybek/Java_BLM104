/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author szeybek
 */
public class SelectChar {
    public static void main(String[] args) {
        String myString = " Fatih 123.3 Sultan Mehmet3.2 vakıf Üniversitesi3";
        char selectedChar = selectRandomChar(myString);
        
       
        String [] words = myString.split(" ");
        for (String s : words) {
            if (s.contains(String.valueOf(selectedChar))) {
                System.out.println( s +" is contain " + selectedChar);
            }
        }

        System.out.println(selectRandomChar(myString));
    }
    
    
    public ArrayList<String> findWordInSentence(String s){
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
        return kelimeler;
    }
            
    
    public static char selectRandomChar(String s){

    Random random = new Random();
    int index = random.nextInt(s.length());
    return s.charAt(index);

}
}
