import java.util.Scanner;
public class Lock {
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        final int CORRECT_PIN=14987;
        final int MAX_ATTEMPT=3;
        int attempt=0;
        int enterd_pin;
        do { 
            System.out.println("Enter the Pin:");
            enterd_pin=var.nextInt();
            attempt++;
            if(enterd_pin==CORRECT_PIN){
                System.out.println("welcome");
                break;
            }else{
                System.out.println("enter wrong pin");
            }
        } while (enterd_pin!=CORRECT_PIN && attempt<=3);
        if(enterd_pin!=CORRECT_PIN){
            System.out.println("phone locked");
        }
    }
}
