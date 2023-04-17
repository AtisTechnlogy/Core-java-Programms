/*
 * Java Basic Examples Pracitce 
 * @version 1.0.0
 * @author Sitaram
 * Source of Exercises:https://www.w3resource.com/java-exercises/array/index.php
 * Example 2: Write a Java program to sum values of an array. 16/04/2023
 */

public class SumofArrayElements {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int sum = 0;

        for(int i: a){
            sum = sum+i;
            
        }
        System.out.println(sum);
    }
}
