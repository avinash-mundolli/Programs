public class ReverseNumber {
    public static void main(String[] args) {
        int num=12345,reverse=0,rem=0;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
// num=num%10;
//sum=sum+num%10;
//num=num/10