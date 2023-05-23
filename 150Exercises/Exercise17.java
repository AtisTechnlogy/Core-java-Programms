/*Adding two binary numbers */
import java.util.Scanner;
public class Exercise17 {
    public static void main(String[] args)
    {
       long binary1, binary2;
       int carry = 0, i = 0;
       int[] sum = new int[16];

       Scanner UserInput = new Scanner(System.in);
       System.out.print("Enter binary number 1: ");
       binary1 = UserInput.nextLong();
       System.out.print("Enter binary number 2: ");
       binary2 = UserInput.nextLong();
       while(binary1 != 0 || binary2 != 0)
       {
         sum[i++] = (int)((binary1 % 10 + binary2 % 10 + carry)%2);
         carry = (int)((binary1 % 10 + binary2 %10 + carry)/2);
         binary1 = binary1 / 10;
         binary2 = binary2 /10;
       }
       if(carry != 0)
            sum[i++] = carry;
       i= i-1;
       System.out.print("sum of binary 1 and binary 2 is:");
       while(i>=0)
       {
        System.out.print(sum[i--]);
       }
       System.out.println();
    }
}
