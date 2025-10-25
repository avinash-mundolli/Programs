import java.util.Scanner;

public class PrimeNumberGivenRange {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        while (true) {
            System.out.println("\nType 'exit' to end the program.");
            System.out.print("Enter the Starting Number: ");
            String input1 = var.nextLine();
            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("Ending the Program...");
                break;
            }

            System.out.print("Enter the Ending Number: ");
            String input2 = var.nextLine();
            if (input2.equalsIgnoreCase("exit")) {
                System.out.println("Ending the Program...");
                break;
            }

            try {
                int start = Integer.parseInt(input1);
                int end = Integer.parseInt(input2);

                System.out.println("\nPrime numbers between " + start + " and " + end + " are:");
                for (int i = start; i <= end; i++) {
                    if (isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();

            } catch (NumberFormatException e) {
                System.out.println("Invalid Input! Please enter valid numbers.");
            }
        }

        var.close();
    }
}
git 