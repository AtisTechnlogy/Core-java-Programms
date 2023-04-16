/*
 * Java Basic Examples Pracitce 
 * @version 1.0.0
 * @author Sitaram
 * Source of Exercises: https://www.w3resource.com/java-exercises/basic/index.php
 * Example 5: Taking User Input from keyboard 16/04/2023
 */
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Input the First Number:");
        int num1 = UserInput.nextInt();

        System.out.print("Input the Second Number:");
        int num2 = UserInput.nextInt();

        int multiple = num1 * num2;

        System.out.println(num1 + " X " + num2 +" = " + multiple );
        

    }
}
