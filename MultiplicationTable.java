/*
 * Java Basic Examples Pracitce 
 * @version 1.0.0
 * @author Sitaram
 * Source of Exercises: https://www.w3resource.com/java-exercises/basic/index.php
 * Example 7: Multiplication Table 16/04/2023
 */
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = UserInput.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + (num*i) );
        }
    }
}
