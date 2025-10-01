
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        int sum = 0;
        int number=10;
        for(int i=1;i<=number;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
