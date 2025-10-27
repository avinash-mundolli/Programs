
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        System.out.println("calculate the sum of N natural numbers");
        while(true){
            System.out.println("Enter the Number or type 'exit' to end:");
            String input=var.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Ending the program");
                break;
            }
            try {
                int num=Integer.parseInt(input);
                if (num<0) {
                    System.out.println("Error: Natural numbers start from 1. Please enter a non-negative number.");
                    continue;
                }
                if (num==0) {
                    System.out.println("Result: 0 (Sum of first 0 natural numbers)");
                    continue;
                }
                long sum=0;
            for(int i=1;i<=num;i++){
                sum+=i;
            }
                System.out.println("Result: "+sum);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input \""+input+"\" Try Again");
            }
        }
        var.close();
    }
}