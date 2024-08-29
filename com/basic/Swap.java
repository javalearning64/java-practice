package basic;

public class Swap {
    public static void main (String[] args){
        int[] numbers = {3, 4, 1, 5, 8, 3, 2};
        int smallest = numbers[0];
        int greatest = numbers[0];
        int smallPos = 0;
        int greatPos = 0;
        for (int i = 1; i < numbers.length; i++){
            if (smallest > numbers[i]){
                smallest = numbers[i];
                smallPos = i;
            } else if (greatest < numbers[i]){
                greatest = numbers[i];
                greatPos = i;
            }
        }
        numbers[smallPos] = greatest;
        numbers[greatPos] = smallest;
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
