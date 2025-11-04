
import java.util.Scanner;

public class Leapyear{
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        while (true) { 
            System.out.println("Enter the year:");
            String num=var.nextLine();
            if(num.equalsIgnoreCase("exit")){
                break;
            }
            try {
                int year=Integer.parseInt(num);
                if(year<=0){
                    System.out.println("enter positive");
                    continue;
                }
                System.out.println((year%400==0)||(year%4==0 && year%100!=0)?" is leaf year":" is not leaf year" );

            } catch (NumberFormatException e) {
                System.out.println("invalid input \""+num+"\"try again");
            }
        }
            
    }
}