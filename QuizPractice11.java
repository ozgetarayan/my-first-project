/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizpractice11;

/**
 *
 * @author Özge
 */
public class QuizPractice11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[][] matrix = createMatrix();
        printMatrix(matrix);
        printPrimeNumbers(matrix);
    }
     public static int[][] createMatrix() {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 101);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printPrimeNumbers(int[][] matrix) {
        System.out.println("\nPrime numbers in the matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isPrime(matrix[i][j])) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
