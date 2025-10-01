import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        while(true){
            System.out.println("enter the number or(type 'exit' to end program)");
            String input=var.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("ending the program");
                break;
            }
            try {
                int n=Integer.parseInt(input);
                if(n<=1){
                    System.out.println(n+ " is not Prime Number");
                    continue;
                }
                boolean isPrime=true;
                for(int i=2;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(n+ " is Prime Number");
                }else{
                    System.out.println(n+ " is not Prime Number");
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid input\""+input+"\"try again");
            }
        }
        var.close();
    }
}
