package basic;

import java.util.Scanner;
public class SmallestOfThree {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int[] list = new int[3];
        System.out.println("Give three numbers");
        int smallest = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        list[0] = smallest;
        list[1] = second;
        list[2] = third;
        for(int i = 1; i < 3; i++){
            if (smallest > list[i]){
                smallest = list [i];
            }
        }
        System.out.println("The smallest number is " + smallest);
    }
}
