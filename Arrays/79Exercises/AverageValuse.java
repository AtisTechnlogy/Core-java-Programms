public class AverageValuse {
    public static void main(String[] args){
        int numbers[] = { 1,2,3,4,5,6,7,8,9,10};
        float sum = 0;
        System.out.println(numbers.length);
        for(int i = 0; i<numbers.length; i++){
            sum = sum + numbers[i];
            }   
        float average = sum/numbers.length;
        System.out.println("Sum : " + sum);
        System.out.print("Average is" + average);


    }
    
}
