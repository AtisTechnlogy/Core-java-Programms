/*
 * Project: Patterns
 * version: 1.0.0
 * @author: Sitaram Date: 17/04/2023
 * idea: Understanding of Nested Loops in java
 * 
 * Problem Description: Print the Diamon shape. Using column increase and Decrease Technique
 * so that patter appers like a diamond.
 */
import java.util.Scanner;

 public class DiamondPattern {
   public static void main(String[] args) {
    
    Scanner UserInput = new Scanner(System.in);
    System.out.print("Enter the number of Rows: ");
    int rows = UserInput.nextInt();
    for(int i =1; i<=rows; i++){
            for(int j = rows; j>=i; j--){
                System.out.print(" ");
            }
            for(int j= 1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i = rows; i>=1; i--){
            for(int j = rows; j>=i; j--){
                System.out.print(" ");
            }
            
            //Second looop
            for(int j = i; j>=1; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
        UserInput.close();
   }
}
