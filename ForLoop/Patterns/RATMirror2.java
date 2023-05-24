/*
 * Project: Right Angled Triangle Mirrored
 * @version 1.0.0
 * @author: Sitaram Date: 17/04/2023
 * 
 * Idea: Understanding Nested loops in Java programing
 * 
 * Problem Description: Printing the Right Angled Triangle (RAT) in Mirrored Fashion.
 *              *
 *             **
 *            ***
 *           ****
 *          *****
 *         ******
 *        *******
 *       ********    
 *     **********  
 */
import java.util.Scanner;

 public class RATMirror2 {
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter Number of rows: ");
        int rows = UserInput.nextInt();
        for(int i = 1; i<=rows; i++){
            //Printing Spaces
            System.out.print("Row:  "+i);
            for(int j = rows; j>=i; j--){
                System.out.print(" ");
            }
            //Printing Stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        UserInput.close();
    }
}
