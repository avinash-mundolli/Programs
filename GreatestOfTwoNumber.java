import java.util.Scanner;

public class GreatestOfTwoNumber {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Find The Greatest Of Two Numbers");
        System.out.println("Type 'exit' to end the program");

        while (true) {
            String input1 = "";
            String input2 = "";

            try {
                System.out.println("\nEnter the First Number:");
                input1 = var.nextLine();
                if (input1.equalsIgnoreCase("exit")) {
                    System.out.println("Ending the Program...");
                    break;
                }

                System.out.println("Enter the Second Number:");
                input2 = var.nextLine();
                if (input2.equalsIgnoreCase("exit")) {
                    System.out.println("Ending the Program...");
                    break;
                }

                double num1 = Double.parseDouble(input1);
                double num2 = Double.parseDouble(input2);

                System.out.println(num1 == num2
                        ? "Both Are Equal"
                        : (num1 > num2
                            ? num1 + " is Greater than " + num2
                            : num2 + " is Greater than " + num1));

            } catch (NumberFormatException e) {
                System.out.println("Invalid input \"" + input1 + "\" or \"" + input2 + "\". Please enter valid numbers.");
            }
        }

        var.close();
    }
}

