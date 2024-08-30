public class SumOfArrays {
    public static void main(String[] args) {
        int[][] first = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
        int[][] second = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
        int[][] sum = new int[3][4];
        for (int row = 0; row < first.length; row++){
            for (int col = 0; col < first[row].length; col++){
                sum[row][col] = (first[row][col] + second[row][col]);
            }
        }
        //test
        for (int row = 0; row < first.length; row++){
            for (int col = 0; col < first[row].length; col++){
                System.out.println(sum[row][col]);
            }
        }
    }
}
