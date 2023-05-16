public class Exercise15 
{
    public static void main(String[] args)
    {
        int a = 10;
        int b= 20;
        int temp;
        System.out.printf("a =%d b=%d\n",a,b);
        temp = a;
        a = b;
        b = temp;
        System.out.printf("After Swapping \na=%d b=%d temp=%d",a,b,temp);
    }
}