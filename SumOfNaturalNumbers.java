
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
                int n=0;
            for(int i=1;i<=num;i++){
                n=n+i;
            }
                System.out.println("Result: "+n);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input \""+input+"\" Try Again");
            }
        }
        var.close();
    }
}