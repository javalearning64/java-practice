package basic;

import java.util.Scanner;
public class Farhenheit {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double farhenheit;
        double celcius;
        System.out.println("Give a temperature in Farenheit");
        farhenheit = input.nextDouble();
        celcius = ((farhenheit - 32) * 5) / 9;
        System.out.println(celcius + " degrees Celcius");
    }
}

