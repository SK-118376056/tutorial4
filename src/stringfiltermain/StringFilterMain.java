/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfiltermain;
import java.util.Scanner;

/**
 *
 * @author adamoc
 */
public class StringFilterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String inputtedStr = scan.next();
        StringFilter strFilter = new StringFilter(inputtedStr);
        System.out.println(strFilter.filter_vowels(inputtedStr));
        System.out.println(strFilter.filter_consonants(inputtedStr));
        scan.close();
    }
    
}
