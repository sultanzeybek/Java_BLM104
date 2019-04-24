/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab09;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author szeybek
 */
public class Q4 {
    public static void main(String[] args) {
        try {
            String file = "/Users/szeybek/Documents/test.txt";
            BufferedOutputStream bos = null;
            bos = new BufferedOutputStream(new FileOutputStream(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Q4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
