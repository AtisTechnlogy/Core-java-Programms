/*
 * Java Basic Examples Pracitce 
 * @version 1.0.0
 * @author Sitaram
 * Source of Exercises: https://www.w3resource.com/java-exercises/basic/index.php
 * Example 15: Swaping of Variables 16/04/2023
 */
public class SwapingVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;
        System.out.println(a + " " + b + " " + temp);
        temp = a;
        a = b;
        b = temp;
        temp = 0;

        System.out.println(a + " " + b + " " + temp);
        
    }
}