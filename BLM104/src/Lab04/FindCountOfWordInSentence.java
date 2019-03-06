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
public class FindCountOfWordInSentence {
    public static void main(String[] args) {
        
        System.out.println(cozum1("i"));
        System.out.println(cozum2("Sultan"));
        System.out.println(word_count("Fatih Sultan Mehmet Fatih", "Fatih"));
        

    }
    
    static int cozum1(String aranan){
     String metin="Fatih Sultan Mehmet Vakıf Üniversitesi";
        int counter = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (aranan.equals(metin.substring(i,i+aranan.length()))){
                System.out.println("Bulundu "+i+" ve "+(i+aranan.length())+" aralığında");
                counter++;
                        
                
            }
           
        }
         return counter;
    
}
    
    static int cozum2(String aranan){
     String metin="Fatih Sultan Mehmet Vakıf Üniversitesi Sultan Mehmet Sultan";
        int sayac;
        int wordCount=0;
        for (int i = 0; i < metin.length(); i++) {
            sayac=0;
            for (int j = 0; j < aranan.length() ; j++) {
                if(metin.charAt(i+j)==aranan.charAt(j))
                   sayac++; 
            }
            i=i+sayac;
            if (sayac==aranan.length()){
                System.out.println("Bulundu "+i+" ve "+(i+aranan.length())+" aralığında");
                wordCount++;
            }
         
        } return wordCount;
    } 
    
    
   static int word_count(String text, String key) {
        int count = 0;
        while (text.contains(key)) {
            count++;
            text = text.substring(text.indexOf(key) + key.length());
        }
        return count;
    }
    
}
