/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizpractice6;
import java.util.Scanner;
/**
 *
 * @author Özge
 */
public class QuizPractice6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("pls enter a row and a coloumn :");
        int r = input.nextInt();
        int c = input.nextInt();
        int [][] matrix = createMatrix();
        printMatrix(matrix);
        index(matrix,r,c);
    }
    public static int [][] createMatrix (){
        int [][] matrix = new int [10][10];
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                matrix[i][j]=(int) (Math.random()*100)+1;
            }
        }
        return matrix;
    }
    
    public static void printMatrix(int [][] array){
         
        for(int i =0;i<10;i++){
            for(int j =0;j<10;j++){
                System.out.print(array[i][j] + " "); 
            }
            System.out.println(" ");    
        }
    }
    
    public static void index(int[][] matrix,int r,int c){
        System.out.println("the "+r+". row and the "+c+". coloumn index is: "+matrix[r][c]);
    }
    
}
