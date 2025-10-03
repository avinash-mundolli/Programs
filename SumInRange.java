import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate Sum In Given Range");

        while (true) {
            String input = "";
            String input2 = "";
            try {
                System.out.println("Enter Starting Number or type 'exit' to end:");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Ending Program");
                    break;
                }
                int start = Integer.parseInt(input);

                System.out.println("Enter Ending Number or type 'exit' to end:");
                input2 = scanner.nextLine();
                if (input2.equalsIgnoreCase("exit")) {
                    System.out.println("Ending Program");
                    break;
                }
                int end = Integer.parseInt(input2);

                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += i;
                }

                System.out.println("Sum from " + start + " to " + end + " is: " + sum);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input \"" + input + "\" or \"" + input2 + "\". Please enter valid numbers.");
            }
        }

        scanner.close();
    }
}
