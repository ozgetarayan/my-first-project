/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizpractice5;

/**
 *
 * @author Özge
 */
public class QuizPractice5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matrix = createMatrix();
        printMatrix(matrix);
        smallest(matrix);
    }
    public static int[][] createMatrix(){
        int [][] matrix = new int[5][5];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=(int)((Math.random()*20)+1);
            }
        }
        return matrix;
    }
    
    public static void printMatrix(int[][] matrix){
         for(int i=0;i<matrix.length;i++){
             System.out.println(" ");
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
         }  
         System.out.println("");
    }
    
    public static void smallest(int[][]matrix){
        int min = matrix[0][0];
        int rowIndex = 0;
        int colIndex = 0;

         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                 if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
         }
         System.out.println("Smallest element: " + min);
        System.out.println("Location: row " + rowIndex + ", column " + colIndex);
    }
}
