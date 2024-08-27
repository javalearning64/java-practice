import java.util.Scanner;
public class GreatestOfThree {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int[] list = new int[3];
        System.out.println("Give three numbers");
        int greatest = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        list[0] = greatest;
        list[1] = second;
        list[2] = third;
        for(int i = 1; i < 3; i++){
            if (greatest < list[i]){
                greatest = list [i];
            }
        }
        System.out.println("The greatest number is " + greatest);
    }
}