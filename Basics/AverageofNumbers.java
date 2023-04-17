/*
 * Java Basic Examples Pracitce 
 * @version 1.0.0
 * @author Sitaram
 * Source of Exercises: https://www.w3resource.com/java-exercises/basic/index.php
 * Example 12: Specified Expression 2 16/04/2023
 */
import java.util.Scanner;

 public class AverageofNumbers {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter Number 1:");
        int num1 = UserInput.nextInt();
        System.out.print("Enter Number 2:");
        int num2 = UserInput.nextInt();
        System.out.print("Enter Number 3:");
        int num3 = UserInput.nextInt();

        double Average = (num1+num2+num3)/3;

        System.out.println("Average of " + num1 + "," + " ," + num2 + " ," + num3 + " is " + Average);

    }
}
