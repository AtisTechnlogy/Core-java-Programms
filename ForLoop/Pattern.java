import java.sql.RowId;

/*
 * Learning and Analyisng For loops
 * @verision 1.0.0
 * @autohor Sitaram
 * Example is Taken from ChatGpt Along with Solution
 * Problem Description: Draw the Diamond Pattern
 *             
 *             *
 *            ***
 *           *****
 *          *******
 *           *****
 *            ***
 *             * 
 */
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
       Scanner UserInput = new Scanner(System.in);
       int row = UserInput.nextInt();
       int space = row - 1;
        //Outer most loop 1
        for(int i = 0; i< 10; i++){
            //loop 1
            for(int j = 0; j < space; j++ ){ // counter j = 1 to 8 only
                System.out.print( " " );
            }
            
            //loop 2
            for(int j =0; j <= i; j++){
                System.out.print(" *");
            }

            System.out.println();
            space--;
        }
        //Outer most loop 2
        space = 0;
        for(int i = 10; i>0; i--){
           //loop 1
            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }
            
            //loop 2
            for(int j = 0; j < i; j++){
                System.out.print(" *");
            }
            System.out.println();
            space++;
        }
    }
}
