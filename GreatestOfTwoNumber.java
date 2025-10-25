import java.util.Scanner;

public class GreatestOfTwoNumber {
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        System.out.println("Find The Greatest Of Two Number");
        System.out.println("Type 'Exit' to End program");
        while(true){
            try {
            System.out.println("Enter the First Number");
            String input1=var.nextLine();
            if(input1.equalsIgnoreCase("exit")){
                System.out.println("Ending The Program");
                break;
            }
            System.out.println("Enter the Second Number");
            String input2=var.nextLine();
            if(input2.equalsIgnoreCase("exit")){
                System.out.println("Ending the Program..");
                break;
            }
            double num1=Double.parseDouble(input1);
            double num2=Double.parseDouble(input2);
            System.out.println(num1==num2 ? "Both Are Equal" : (num1>num2 ? num1+" is Greater than "+num2 :num2+ " is Greater than "+num1));
            
        } catch (NumberFormatException e) {
           // System.out.println("invalid input\""+input1+"or"+input2+""\);
            System.out.println("Invalid input \"" + input1 + "\" or \"" + input2 + "\". Please enter valid numbers.");
        }
        }

    }
}
