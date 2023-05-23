import java.util.Scanner;
public class Exercise19 
{
    public static void main(String[] args)
    {
        int[] bin_num = new int[16];
        int  i=0, quot;
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int dec_num = UserInput.nextInt();
        quot = dec_num;

        while(quot !=0)
        {
            bin_num[i++] = quot %2;
            quot = quot /2;
        }
        System.out.println(i);
        System.out.println(dec_num + " in binary format: " );
        while(i>=0)
        {
            System.out.print(bin_num[i--]);
        }
        System.out.println();
        UserInput.close();
    }
}