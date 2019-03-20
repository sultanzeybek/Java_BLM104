/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

/**
 *
 * @author szeybek
 */
public class Q3 {
    public static void main(String[] args) {
        
        String dizi[] = {"1", "6", "1g", "10", "d"};

        for (int i = 0; i < dizi.length; i++) {
            try {
                Integer.parseInt(dizi[i]);
            } catch (Exception e) {
                System.out.println(e.getClass()+":"+e.getMessage()+" Hatali eleman " + dizi[i] );
            }
        } 
    }
    }

