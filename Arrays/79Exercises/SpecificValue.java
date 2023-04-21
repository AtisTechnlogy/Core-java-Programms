import java.util.Scanner;

public class SpecificValue {
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);
        
        System.out.print("Enter the number You want to Check: ");
        int specificValue = UserInput.nextInt();
        UserInput.close();
        int[] Array = {1,2,3,4,5,12};
        for(int i = 0; i<Array.length ; i++){
            if(specificValue == Array[i]){
                System.out.print(specificValue + " is presents");
            }
            
        }
     
            System.out.print(specificValue + " is not Present\n");
            System.out.println("Success !!!");
    }
}
