package basic;

public class SecondGreatest {
    public static void main (String[] args){
        int[] numbers = {8, 3, 5, 7, 6};
        int greatest = 0;
        int second = 0;
        for (int i = 0; i < numbers.length; i++){
            if (greatest < numbers[i]){
                greatest = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++){
            if (second < numbers[i] && numbers[i] < greatest){
                second = numbers[i];
            }
        }
        System.out.println("The second greatest number is " + second);
    }
}
