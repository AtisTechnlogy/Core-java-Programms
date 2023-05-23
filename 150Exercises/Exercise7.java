import java.util.Scanner;
public class Exercise7 {
  public static void main(String[] args)
  {
    Scanner UserInput = new Scanner(System.in);
    System.out.print("Input a number: ");
    
    int a = UserInput.nextInt();

    for(int i =1; i<=10; i++)
    {
        System.out.println(a + " X " + i + "=" + (a*i) );
    }
    UserInput.close();
  } 
}
