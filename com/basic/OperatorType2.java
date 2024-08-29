package basic;

import java.util.Scanner;
public class OperatorType2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give an operation");
        char operation = input.next().charAt(0);
        switch (operation){
            case '+':
            case '-':
            case '*':
            case '/':
                System.out.println("This is an arithmetic operator.");
                break;
            case '<':
            case '>':
                System.out.println("This is a relational operator.");
                break;
            case '=':
                System.out.println("This is an assignment operator.");
                break;
            default:
                System.out.println("This is not an operator.");
        }
    }
}
