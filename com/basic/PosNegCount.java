package basic;

public class PosNegCount {
    public static void main (String[] args){
        int[] numbers = {-2, -4, 6, -3, 9, 10, -1};
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0){
                negativeCount++;
            } else {
                positiveCount++;
            }
        }
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
    }
}
