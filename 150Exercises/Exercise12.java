import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter number1; ");
        float a = UserInput.nextFloat();
        System.out.print("Enter number2: ");
        float b = UserInput.nextFloat();
        System.out.print("Enter number3: ");
        float c = UserInput.nextFloat();
     
        float Average = (a+b+c)/3;

        System.out.println("Average of "+ a +","+ b +","+ c + ", is " + Average );
    }
}
