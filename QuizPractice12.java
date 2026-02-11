/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizpractice12;

/**
 *
 * @author Özge
 */
public class QuizPractice12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] matrix = createMatrix();
        printMatrix(matrix);
        countVowelsAndConsonants(matrix);
    }
    public static char[][] createMatrix() {
        char[][] matrix = new char[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (char) ('a' + (int)(Math.random() * 26));
            }
        }
        return matrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void countVowelsAndConsonants(char[][] matrix) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char ch = matrix[i][j];

                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("\nVowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || 
               ch == 'o' || ch == 'u';
    }
}
