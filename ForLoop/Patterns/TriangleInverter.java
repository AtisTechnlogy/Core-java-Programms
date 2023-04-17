import java.util.Scanner;

public class TriangleInverter {
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter Number of Row: ");
        int rows = UserInput.nextInt();
        for(int i = 1; i<=rows; i++){
            System.out.print("row:" + i + " ");
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=rows; j>=i; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
