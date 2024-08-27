import java.util.Scanner;
public class Characters {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give a character");
        char character = input.next().charAt(0);
        if (character >= 'a' && character <= 'z'){
            System.out.println("Character is a lowercase letter.");
        } else if (character >= 'A' && character <= 'Z'){
            System.out.println("Character is a uppercase letter.");
        } else if (Character.isDigit(character)){
            System.out.println("Character is a digit.");
        } else {
            System.out.println("Character is a special character.");
        }
    }
}
