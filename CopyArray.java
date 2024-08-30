public class CopyArray {
    public static void main(String[] args) {
        int[][] firstArray = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        int[][] secondArray = {{0, 1, 2, 3}, {3, 4, 5, 6}, {6, 7, 8, 9}};
        for (int row = 0; row < firstArray.length; row++){
            for (int col = 0; col < firstArray[row].length; col++){
                secondArray[row][col] = firstArray[row][col];
            }
        }
        //test
        for (int row = 0; row < firstArray.length; row++){
            for (int col = 0; col < firstArray[row].length; col++){
                System.out.println(secondArray[row][col]);
            }
        }
    }
}
