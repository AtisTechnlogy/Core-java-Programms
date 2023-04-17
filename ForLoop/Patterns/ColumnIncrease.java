/*
 * Project Patterns
 * @version: 1.0.0
 * @author: sitaram Date: 17/04/2023
 * Idea: Understading Counters in Nested Loops using Pattern printing
 * While Printin patterns usage of rows and columns is very common. An Abstract study of these 
 * patterns is main goal in this code.
 * 
 * Example 2: Printing Pattern as Rows grow Column number increase.
 * Description of the software:
 * This program prints columns in increased Fashion. As the row number increses columns alos increases.
 * This pattern is appeared as Right Angled triangle. If user enter 5 rows and it prints 5 rows and
 * and columns in increasing fashion. So last row only has 5 columns.
 * 
 * Objectives: 1. Usage of nested for loop
 *             2. Understanding How counters works
 */
import java.util.Scanner;

public class ColumnIncrease {
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int rows = UserInput.nextInt();
        for(int i = 1; i <= rows; i++){
            System.out.print("row " + i + ". ");
            for(int j = 1; j<=i; j++){
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
