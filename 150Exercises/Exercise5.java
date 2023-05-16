import java.util.Scanner;
public class Exercise5 {
   
        public static void main(String[] args)
        {
            Scanner UserInput = new Scanner(System.in);
            System.out.println("Enter number1: ");
            int a = UserInput.nextInt();
            System.out.println("Enter number2: ");
            int b = UserInput.nextInt();
            int c = a*b;

            System.out.println(a + "*" + b + "=" + c);
        }
   
}
 