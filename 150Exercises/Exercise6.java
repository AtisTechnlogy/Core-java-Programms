import java.util.Scanner;
public class Exercise6 {
   public static void main(String[] args)
   {
     Scanner UserInput = new Scanner(System.in);
     System.out.print("Input first number: ");
     float a = UserInput.nextFloat();
     System.out.print("Input second number: ");
     float b = UserInput.nextFloat();

    
     System.out.println(a +"+"+ b + "=" + (a+b));
     System.out.println(a +"-"+ b + "=" + (a-b) );
     System.out.println(a +"X"+ b + "=" + (a*b));
     System.out.println(a +"/"+ b + "=" + (a/b));
     System.out.println(a +" mod "+ b +"="+ (a%b) );
   } 
}
