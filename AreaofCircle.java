/*
 * Java Basic Examples Pracitce 
 * @version 1.0.0
 * @author Sitaram
 * Source of Exercises: https://www.w3resource.com/java-exercises/basic/index.php
 * Example 11: Specified Expression 2 16/04/2023
 */
import java.util.Scanner;

 public class AreaofCircle {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        
        System.out.print("Enter the Radius:");
        double radius = UserInput.nextDouble();
        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * radius * radius;
        
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);
    
      

    }
}
