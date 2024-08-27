package basic;
public class Average {
    public static void main (String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6};
        double sum = 0;
        double average;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        average = (sum / numbers.length);
        System.out.println(average);
    }
}
