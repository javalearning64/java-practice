import java.util.Scanner;
public class NCharPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Percy Jackson and the Lightning Thief";
        System.out.println("Give a number between 1 and " + (sentence.length() + 1));
        int pos = input.nextInt();
        System.out.println("Give a number between " + (pos + 1) + " and " + (sentence.length() + 1));
        int n = input.nextInt();
        if (n == 41){
            System.out.println(sentence);
        } else {
            System.out.println(sentence.substring(pos, n));
        }
    }
}
