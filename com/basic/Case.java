package basic;

import java.util.Scanner;
public class Case {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Give a letter");
        char letter = input.next().charAt(0);
        if (Character.toLowerCase(letter) == letter){
            System.out.println("character is lower case");
        } else {
            System.out.println("character is upper case");
        }
    }
}
