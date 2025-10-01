import java.util.Scanner;
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        while(true){
            System.out.println("Enter the number or type 'exit' to end program");
            String input=var.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("ending the program");
                break;
            }try {
                int n=Integer.parseInt(input);
                System.out.println(n+(n%2==0?" is even number":" odd number"));
            } catch (NumberFormatException e) {
                System.out.println(" invalid input\""+input+"\" try again");
            }
        }
        var.close();
    }
}
