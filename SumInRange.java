
import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        System.out.println("Calculate Sum In Given Range");
        while(true){
            try {
            System.out.println("Enter Stating Number '0r' type 'exit' to end");
            String input=var.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Ending Program");
                break;
            }
            int n=Integer.parseInt(input);
            System.out.println("Enter the Last Number");
            String input2=var.nextLine();
            if(input2.equalsIgnoreCase("exit")){
                System.out.println("Ending Program");
                break;
            }
            int n2=Integer.parseInt(input2);
            int sum=0;
            for(int i=n;i<-n2;i++){
                sum=sum+i;
            }
            System.out.println(sum);

            } catch (NumberFormatException e) {
                System.out.println("invald");
            }
        }
    }
}