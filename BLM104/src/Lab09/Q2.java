/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;




/**
 *
 * @author szeybek
 */
public class Q2 {

   
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String dosya = "/Users/szeybek/Documents/test.txt";
            br = new BufferedReader(new FileReader(dosya));
            String s;
            while ((s=br.readLine())!= null) {                
                System.out.println(s);
            }
           
        } catch (Exception e) {
        } 

    }
    
}
