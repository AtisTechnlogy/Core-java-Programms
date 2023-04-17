/*
 * Java Basic Examples Pracitce 
 * @version 1.0.0
 * @author Sitaram
 * Source of Exercises: https://www.w3resource.com/java-exercises/array/index.php
 * Example 2: Write a Java program to sort a numeric array and a string array ? . Date:16/04/2023
 */
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int my_Array[] = {1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
        
            for(int i : my_Array){
                System.out.print(i + " ");
            }

        Arrays.sort(my_Array);
        System.out.println("\nNumbers are sorted");
        for(int i : my_Array){
            System.out.print(i + " ");
        }
    }
}
