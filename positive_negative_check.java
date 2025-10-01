
import java.util.Scanner;

public class positive_negative_check{
    public static void main(String[] args){
        Scanner var=new Scanner(System.in);
        while(true){
            System.out.println("Enter the Number or type 'exit' to end program");
            String input = var.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Ending the program");
                break;
            }try {
                int n=Integer.parseInt(input);
                System.out.println(n+(n==0?"not positive nither a negative":n>0?"is positive":"is negative"));

            } catch (NumberFormatException e) {
                System.out.println("Invalid Input\""+input+"\"Try Again");
            }
        }
        var.close();
    }
}