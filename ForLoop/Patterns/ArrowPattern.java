/*
 * Project: Patterns
 * @version: 1.0.0
 * @author: Sitaram Date: 17/04/2023
 * 
 * Idea: Understanding Nested Loops in java
 * 
 * Problem Description: Printin two right angled Triangles oppositely so it appears like an arrow or Greater
 * than symbol (>)
 * *
*                                                  *
*                                                  **
*                                                  ***
*                                                  ****
*                                                  *****
*                                                  ******
*                                                  *******
*                                                  ********
*                                                  *********
*                                                  *********
*                                                  ********
*                                                  *******
*                                                  ******
*                                                  *****
*                                                  ****
*                                                  ***
*                                                  **
*                                                  *
*
 */
import java.util.Scanner;

 public class ArrowPattern {
    public static void main(String[] args){
       Scanner UserInput = new Scanner(System.in);

       System.out.print("Enter Number of rows: ");
       int rows = UserInput.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=rows; i++){
            for(int j = 10; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();   
        }
    }
}