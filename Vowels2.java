import java.util.Scanner;
public class Vowels2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a vowel");
        char letter = input.next().charAt(0);
        letter = Character.toLowerCase(letter);
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("not a vowel");
        }
    }
}