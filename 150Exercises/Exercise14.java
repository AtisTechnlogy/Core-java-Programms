public class Exercise14 {
    public static void main(String[] args)
    {
       String pattern1 = "* * * * * * ==========================================\n * * * * * ===========================================";
       String pattern2 = "======================================================";

       for(int i = 0; i<2; i++)
       {
         System.out.println(pattern1);
       }
       for(int i = 0; i<5; i++)
       {
         System.out.println(pattern2);
       }
    }
}
