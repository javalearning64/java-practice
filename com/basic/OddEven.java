package basic;

import java.util.Scanner;

public class OddEven {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Give an integer");
        number = input.nextInt();
        if (number % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
