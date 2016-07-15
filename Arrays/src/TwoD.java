import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Arrays
        int[] intarray = new int[9];
        // Array of integers
        int[][] twoDArray = new int[8][8];
        // Array of array of integers

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = i * j;

            }
        }
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = i * j;
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        // Calculating the trace (the sum of the numbers on the diagonal)
        // ***test question***
        // square matrix
        int sum = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            sum += twoDArray[i][i];
        }
        System.out.println(sum);
    }
}