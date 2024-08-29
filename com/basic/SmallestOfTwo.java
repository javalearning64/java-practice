package basic;

import java.util.Scanner;
public class SmallestOfTwo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give two numbers");
        int first = input.nextInt();
        int second = input.nextInt();
        if (first < second){
            System.out.println(first + " is the smallest number of the two");
        } else if (second < first){
            System.out.println(second + " is the smallest number of the two");
        } else {
            System.out.println("Both numbers are equivalent");
        }
    }
}
