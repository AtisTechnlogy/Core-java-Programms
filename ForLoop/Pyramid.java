public class Pyramid {
   public static void main(String[] args){
    
     for(int i = 0; i < 5; i++) {
        for(int j = 4; j>i; j--){
            System.out.print(" ");
        }
        for(int j = 0; j< 2*i+1; j++){
            System.out.print("*");
        }
        System.out.println();
     }
     int space = 5;
     for(int i = 0; i < 5; i++){
        for(int j = space; j>0; j--){
           System.out.print(" ");
        }
        for(int j =11; j> 2*i+1; j--){
           System.out.print("*");
        }
        space--;
        System.out.println();
     }

   }
}
