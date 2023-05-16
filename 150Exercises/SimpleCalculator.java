import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter first Number:");
        int num1 = UserInput.nextInt();

        System.out.print("Enter Second Number:");
        int num2 = UserInput.nextInt();

        System.out.println(num1 + " + " + num2 +" = " + (num1+num2));
        System.out.println(num1 + " - " + num2 +" = " + (num1-num2));
        System.out.println(num1 + " X " + num2 +" = " + (num1*num2));
        System.out.println(num1 + " / " + num2 +" = " + (num1/num2));
        System.out.println(num1 + " mod " + num2 +" = " + (num1%num2));

    }
}
