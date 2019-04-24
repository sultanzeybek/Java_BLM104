/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab09;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author szeybek
 */
public class Q3 {
    public static void main(String[] args) {
        String file = "/Users/szeybek/Documents/test.txt";
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(file,true));
            br.write("\nAhmet Ak Welcome");
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Q3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
