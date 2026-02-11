/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizpractice10;

/**
 *
 * @author Özge
 */
public class QuizPractice10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix = createMatrix();
        printMatrix(matrix);
        checkOneDigit(matrix);
    }
    public static int[][] createMatrix() {
        int[][] matrix = new int[10][10];

        for (int i =0; i < matrix.length; i++) {
            for (int j= 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 101);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i =0; i < matrix.length; i++) {
            for (int j =0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void checkOneDigit(int[][] matrix) {
        boolean allRowsHaveOneDigit = true;
        boolean allColsHaveOneDigit = true;

        for (int i =0; i < matrix.length; i++) {
            boolean found = false;
            for (int j =0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= 0 && matrix[i][j] <= 9) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                allRowsHaveOneDigit = false;
                break;
            }
        }

        for (int j =0; j < matrix[0].length; j++) {
            boolean found = false;
            for (int i =0; i < matrix.length; i++) {
                if (matrix[i][j] >= 0 && matrix[i][j] <= 9) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                allColsHaveOneDigit = false;
                break;
            }
        }

        if (allRowsHaveOneDigit && allColsHaveOneDigit) {
            System.out.println("Every row and every column has at least one one-digit number.");
        } else {
            System.out.println("Not every row or column has a one-digit number.");
        }
    }
}
