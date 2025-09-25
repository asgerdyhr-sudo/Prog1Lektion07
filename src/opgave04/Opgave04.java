package opgave04;

import java.util.Scanner;

public class Opgave04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Test af pallindromeCheckWithArray: (True expected)");
        String text = "ABBA";
        System.out.println(pallindromeCheckWithArray(text));

        System.out.println();

        System.out.println("Test af pallindromeCheckWithArray: (True expected)");
        String text2 = "mellem";
        System.out.println(pallindromeCheckWithArray(text2));

        System.out.println();

        System.out.println("Test af pallindromeCheckWithArray: (False expected)");
        String text3 = "Pebersovs";
        System.out.println(pallindromeCheckWithArray(text3));

        System.out.println();

        System.out.println("Indtast en string: ");
        String text4 = input.nextLine();

        System.out.println("Er det et pallindromie: " + pallindromeCheckWithArray(text4));
    }

    public static boolean pallindromeCheckWithArray(String text){
        char[] charArray = text.toCharArray();
        for(int i = 0; i<charArray.length/2; i++){
            if(charArray[i] != charArray[charArray.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
