package basic;

import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a vowel");
        char letter = input.next().charAt(0);
        letter = Character.toLowerCase(letter);
        if (letter == 'a'){
            System.out.println("vowel");
        } else if (letter == 'e'){
            System.out.println("vowel");
        } else if (letter == 'i'){
            System.out.println("vowel");
        } else if (letter == 'o'){
            System.out.println("vowel");
        } else if (letter == 'u'){
            System.out.println("vowel");
        } else {
            System.out.println("not a vowel");
        }
    }
}
