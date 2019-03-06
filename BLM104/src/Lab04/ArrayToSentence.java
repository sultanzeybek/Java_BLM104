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
public class ArrayToSentence {
    public static void main(String[] args) {
        
        
        String[] kelimeler={"Fatih","Sultan","Mehmet"};
        System.out.println(kelimeleriBirlestir(kelimeler));
        String cümle = kelimeleriBirlestir(kelimeler);
        String ara= "tan";
        if(cümle.contains(ara)) System.out.println("Yess");
    }
    
    static String kelimeleriBirlestir(String[] s){
        String sonuc="";
        for (String kelime : s) {
            sonuc+=kelime+" ";
        }
        return sonuc;
    }
        
    }
    

