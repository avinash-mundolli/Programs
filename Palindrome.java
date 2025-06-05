import java.util.Scanner;
public class Palindrome {
    public static boolean isPlaindrome(String str){
        str=str.replaceAll("[\\W_\\s]","").toLowerCase();
        if(str.isEmpty()) return false;
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        while (true) {
            System.out.println("enter the String or(type 'exit' to quite)");
            String input=var.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("ending program");
                break;
            }
            System.out.println(input+(isPlaindrome(input)?" is palindrome":" not Palindrome"));
        }
        var.close();
    }
}
