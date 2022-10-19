
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class EngToPigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to translate");
        String word = input.nextLine();
        word = word.toUpperCase();
        if (word.startsWith("A") || word.startsWith("I") || word.startsWith("U") || word.startsWith("E") || word.startsWith("O")) {
            String translate = word + "WAY";
            System.out.println(word + " im Piglatin is " + translate);
        } else {
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (letter == 'A' || letter == 'O' || letter == 'I' || letter == 'E' || letter == 'U') {
                    String front = word.substring(0, i);
                    String back = word.substring(i);
                    String translate = back + front + "AY";
                    System.out.println(word + " in PigLatin is " + translate);
                    break;
                }
            }
        }
    }
    
}
