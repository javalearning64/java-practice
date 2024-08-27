import java.util.Scanner;
public class OperatorType {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Give an operation");
        String operator = input.next();
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")){
            System.out.println("This is an arithmetic operator");
        } else if (operator.equals("<") || operator.equals(">")){
            System.out.println("This is a relational operator");
        } else if (operator.equals("=")){
            System.out.println("This is an assignment operator");
        }
    }
}
