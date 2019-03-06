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
public class PersonelTest {
    public static void main(String[] args) {
        ArrayList<Personel> personelList = new ArrayList<>();
        
        Personel p1 = new Personel("Ahmet Ak", "10.10.1993");
        Personel p2 = new Personel("Ayse Sari", "10.10.2010");
        Personel p3 = new Personel("Anna Karanina", "01.01.1987");
        
        personelList.add(p1);
        personelList.add(p2);
        personelList.add(p3);
        System.out.println("The List of Personel whose birthday is smaller than 1990");
        ListPersonels(personelList);
                
    }
    
    static void ListPersonels(ArrayList<Personel> pList){
        for (Personel p : pList) {
         int n = p.birthDate.lastIndexOf(".");
         String s = p.birthDate.substring(n+1);
         if(Integer.valueOf(s) >= 1990) System.out.println(p.name + " -----> " +p.birthDate);
                
        }
    }
    
}
