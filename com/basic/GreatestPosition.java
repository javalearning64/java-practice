package basic;

public class GreatestPosition {
    public static void main (String[] args){
        int[] numbers = {1, 2, 5, 3, 2, 4};
        int greatest = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++){
            if (greatest < numbers[i]){
                greatest = numbers[i];
                index = i;
            }
        }
        System.out.println("Greatest number in the array is " + greatest + " at index " + index);
    }
}
