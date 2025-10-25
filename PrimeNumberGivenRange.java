import java.util.Scanner;

public class PrimeNumberGivenRange {

public static boolean isPrime(int num){
    if(num<=1) return false;
    for(int i=2;i<=Math.sqrt(num);i++){
        if(num%i==0) {
            return false;
        }
    }
    return true;
}
        

    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        while (true) { 
            System.out.println("type 'Exit' to End Program");
            System.out.println("Enter the Starting Number: ");
            String input1=var.nextLine();
            if(input1.equalsIgnoreCase("exit")){
                System.out.println("Ending The Program");
                break;
            }
            System.out.println("ENter the End Number: ");
            String input2=var.nextLine();
            if(input1.equalsIgnoreCase("exit")){
                System.out.println("Ending The Program");
                break;
            }
            try {
                int start=Integer.parseInt(input1);
                int end=Integer.parseInt(input2);
                for(int i=start;i<=end;i++){
                    if(isPrime(i)){
                        System.out.println(i+" ");
                    }
                }
                System.out.println();
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input Try Again");
            }
            var.close();
        }

        }
}
