package basic;

public class PrintOddEven {
    public static void main (String[] args){
        System.out.println("Evens:");
        for (int i = 1; i < 101; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Odds:");
        for (int i = 1; i < 101; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
