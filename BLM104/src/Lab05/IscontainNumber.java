/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author szeybek
 */
public class IscontainNumber {
    public static void main(String[] args) {
        String myString = " Fatih 123.3 Sultan Mehmet3.2 vakıf Üniversitesi3";
        Pattern desen = Pattern.compile("[0-9]");
      
        
        int counter = 0;
        
        String[] words = myString.split(" ");
        for (String s : words) {
         Matcher arama1 = desen.matcher(s);

            while (arama1.find()) {                
                counter++;
                System.out.println(s);
                break;
            }
           
        }
        System.out.println(counter + " adet sayi içeren kelime vardır");
    }
    
}
