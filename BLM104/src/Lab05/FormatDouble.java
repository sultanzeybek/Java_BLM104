/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author szeybek
 */
public class FormatDouble {

    public static void main(String[] args) {
        String myString = " Fatih 123.3 Sultan Mehmet3.2 vakıf Üniversitesi3";

        StringBuilder sb = new StringBuilder();
        Pattern desen = Pattern.compile("[0-9]+.[0-9]");
        String[] words = myString.split(" ");
        for (String s : words) {
            Matcher arama1 = desen.matcher(s);

        }

    }

}
