import java.math.BigInteger;
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        while(true){
            System.out.println("Enter the number or(type 'exit' to end program)");
            String input=var.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("ending the program");
                break;
            }
            try {
                BigInteger fact=BigInteger.ONE;
                int n=Integer.parseInt(input);
            for(int i=1;i<=n;i++){
                fact=fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact);
                
            } catch (NumberFormatException e ) {
                System.out.println("invalid input\""+input+"\"try again");
            }
        }
        var.close();
    }
}