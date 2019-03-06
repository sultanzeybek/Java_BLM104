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
public class isPalindrome {
    public static void main(String[] args) {
        if(isPalindrome("ana")) System.out.println("Yess");
        
    }
    
    static boolean isPalindrome(String myString){
        boolean isPal= false;
        String reverseString="";
        
        for (int i =myString.length()-1 ; i >=0; i--) {
            reverseString += myString.charAt(i);
            
        }
        if (myString.equals(reverseString)) {
            isPal = true;
        }
        return isPal;
    }
    
}
