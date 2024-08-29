package basic;

import java.util.Scanner;
public class LeapYear {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give a year");
        int year = input.nextInt();
        if (year % 4 == 0){
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }
    }
}
