public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        int start=1,end=1000;
        for(int num=start;num<=end;num++){
            int original=num;
            int sum=0;
            int digits=String.valueOf(num).length();
            
            int temp=num;
            while(temp>0){
                int digit=temp%10;
                sum=(int)(sum+Math.pow(digit, digits));
                temp=temp/10;

            }
            if(sum==original){
                System.out.println(original);
            }
        }
    }
}
