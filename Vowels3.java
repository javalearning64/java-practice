import java.util.Scanner;
public class Vowels3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give a letter");
        char letter = input.next().charAt(0);
        letter = Character.toLowerCase(letter);
        switch(letter){
            case 'a':
                System.out.println("apple");
                break;
            case 'e':
                System.out.println("elephant");
                break;
            case 'i':
                System.out.println("ireland");
                break;
            case 'o':
                System.out.println("orange");
                break;
            case 'u':
                System.out.println("universe");
                break;
            default:
                System.out.println("not a vowel");
        }
    }
}
