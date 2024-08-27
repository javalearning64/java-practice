public class SmallestPosition {
    public static void main (String[] args){
        int[] numbers = {2, 4, 5, 0, 7, 1};
        int smallest = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++){
            if (smallest > numbers[i]){
                smallest = numbers[i];
                index = i;
            }
        }
        System.out.println("Smallest number in the array is " + smallest + " at index " + index);
    }
}
