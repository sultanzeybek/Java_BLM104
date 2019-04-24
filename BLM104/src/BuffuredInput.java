
import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author szeybek
 */
public class BuffuredInput {

    public static void main(String[] args) {
        FileInputStream f = null;
        try {
            String dosya = "/Users/szeybek/Documents/test.txt";
            f = new FileInputStream(dosya);
            BufferedInputStream bis = new BufferedInputStream(f);
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());

            System.out.println((char) bis.read());

            System.out.println((char) bis.read());

        } catch (Exception e) {
        }
    }

}
