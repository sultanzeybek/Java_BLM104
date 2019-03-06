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
public class FindWordInSentence {
    public static void main(String[] args) {
        
    cozum1();
    }
    
    static void cozum1(){
     String metin="FAith Sultan Mehmet Vakıf Üniversitesi";
        String aranan="Sultan";
        for (int i = 0; i < metin.length(); i++) {
            if (aranan.equals(metin.substring(i,i+aranan.length()))){
                System.out.println("Bulundu "+i+" ve "+(i+aranan.length())+" aralığında");
                break;
            }
        }
    
}
    
    static void cozum2(){
     String metin="Fatih Sultan Mehmet Vakıf Üniversitesi Sultan Mehmet Sultan";
        String aranan="Sultan";
        int sayac;
        for (int i = 0; i < metin.length(); i++) {
            sayac=0;
            for (int j = 0; j < aranan.length() ; j++) {
                if(metin.charAt(i+j)==aranan.charAt(j))
                   sayac++; 
            }
            i=i+sayac;
            if (sayac==aranan.length()){
                System.out.println("Bulundu "+i+" ve "+(i+aranan.length())+" aralığında");
                break;
            }
         
        }
    }
}
