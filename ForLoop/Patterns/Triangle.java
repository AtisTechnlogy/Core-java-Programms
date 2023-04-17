/*
 * Project: Patterns
 * @version: 1.0.0
 * @author: Sitaram Date: 17/04/2023
 * 
 * Idea: Understanding nested loops in Java
 * 
 * Problem Description: Printing the Triangle using column decrease technique, so it apperas as a equilateral 
 * Triangle.
 *                row1    * * * * * * * * * *                
                  row2     * * * * * * * * *
                  row3      * * * * * * * *
                  row4       * * * * * * *
                  row5        * * * * * *
                  row6         * * * * *
                  row7          * * * *
                  row8           * * *
                  row9            * *
                  row10            *
 */
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int rows = UserInput.nextInt();
        for(int i = 1; i<=rows; i++){
            System.out.print("row"+i+ "  ");
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j = rows; j>=i; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}