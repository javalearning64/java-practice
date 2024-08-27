import java.util.Scanner;
public class GreatestOfTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number");
        int first = input.nextInt();
        System.out.println("Give another number");
        int second = input.nextInt();
        if (first > second){
            System.out.println(first + " is the greatest number of the two");
        } else if (second > first){
            System.out.println(second + " is the greatest number of the two");
        } else {
            System.out.println("Both numbers are equivalent");
        }
    }
}
