public class Leapyear{
    public static void main(String[] args) {
        int num=200;
            System.out.println((num%400==0)||(num%4==0 && num%100!=0)?" is leaf year":" is not leaf year" );
    }
}