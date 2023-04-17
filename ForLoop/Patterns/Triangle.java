/*
 * Project: Patterns
 * @version: 1.0.0
 * @author: Sitaram Date: 17/04/2023
 * 
 * Idea: Understanding nested loops in Java
 * 
 * Problem Description: Printing the Triangle using column decrease technique, so it apperas as a equilateral 
 * Triangle.
 *                                     Row: 1           *
                                       Row: 2          * *
                                       Row: 3         * * *
                                       Row: 4        * * * *
                                       Row: 5       * * * * *
                                       Row: 6      * * * * * *
                                       Row: 7     * * * * * * *
                                       Row: 8    * * * * * * * *
                                       Row: 9   * * * * * * * * *
                                       Row: 10  * * * * * * * * * *
 */
import java.util.Scanner;

 public class Triangle{
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");
        int rows = UserInput.nextInt();
        UserInput.close();
        
        for(int i = 1; i <= rows; i++){
            System.out.print("Row: "+i);
            for(int j= rows; j>=i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        
    }
}
