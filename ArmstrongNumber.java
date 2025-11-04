public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153,sum=0;
        int original=num;
        int digits=String.valueOf(num).length();
        while(num>0){
            int digit=num%10;
            sum=(int) (sum+Math.pow(digit, digits));
            num=num/10;
        }
        System.out.println(sum==original?"is armstrong number":"not armstrong number");
    }
}
