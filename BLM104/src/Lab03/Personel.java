/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

import java.util.ArrayList;

/**
 *
 * @author szeybek
 */
public class Personel {
    public static ArrayList<Personel> Liste = new ArrayList<Personel>();
    public String Adi;


    public Personel() {
        this.Adi = "isimsiz";
      
    }

    public Personel(String ad) {
        this.Adi = ad;
      
    }

    public String toString() {
        return this.Adi;
       
    }
    
}
