/*
 * Project Patterns
 * @version: 1.0.0
 * @author: sitaram Date: 17/04/2023
 * Idea: Understading Counters in Nested Loops using Pattern printing
 * 
 * While Printin patterns usage of rows and columns is very common. An Abstract study of these 
 * patterns is main goal in this code.
 * 
 * Example 3: Printing Columns in Decreasing order
 * Description of the software:
 * This program takes total number of rows and columns to be print on scree from the user and print 
 * columns in Decreasing order. So the patter appears like inverted Right angled Triangle.
 */
import java.util.Scanner;

 public class ColumnsDecrease {
    public static void main(String[] args){
       Scanner UserInput = new Scanner(System.in);
    
       System.out.print("Enter Total Rows: ");
       int rows = UserInput.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int j = rows;j>=i; j--){
                System.out.print(" "+j);
            }
            System.out.println();           
        }
        UserInput.close();
   }
    
}
