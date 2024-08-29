package basic;

import java.util.Scanner;
public class Digits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number");
        int number = input.nextInt();
        int count = 0;
        while (number > 0){
            number /= 10;
            count++;
        }
        System.out.println("The given number is a " + count + " digit number");
    }
}
