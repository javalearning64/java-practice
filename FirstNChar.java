import java.util.Scanner;
public class FirstNChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = "Harry Potter and the Order of the Phoenix";
        System.out.println("Give a number between 0 and " + (sentence.length() - 1));
        int n = input.nextInt();
        if (n == sentence.length()){
            System.out.println(sentence);
        } else {
            System.out.println(sentence.substring(0, n));
        }
    }
}
