/*
 * Project Patterns
 * @version: 1.0.0
 * @author: sitaram Date: 17/04/2023
 * Idea: Understading Counters in Nested Loops
 * 
 * While Printin patterns usage of rows and columns is very common. An Abstract study of these 
 * patterns is main goal in this code.
 * 
 * Example 1: Printing even Number of rows and columns
 * Description of the software:
 * This program takes total number of rows and columns to be print on scree from the user and print 
 * Even number of columns and rows. If the user input is 5 then it prints 5 rows and 5 columns
 */
import java.util.Scanner;

public class EvenRowsAndColumns {
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in); 
        System.out.print("Enter total number of columns and rows:");
        int rows = UserInput.nextInt();  
        for(int i = 1; i<=rows; i++){
                System.out.print(i+".");
                for(int j = 1; j<=rows; j++){
                    System.out.print(" "+j);
                }
                System.out.println();
            }
    }
}
