public class NegativeSum {
    public static void main (String[] args){
        int[] numbers = {-5, -4, -2, 1, 2, 3};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0){
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
