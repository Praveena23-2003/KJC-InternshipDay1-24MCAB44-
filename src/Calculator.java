import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperator = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        validOperator = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
                    validOperator = false;
                    break;
            }

            if (validOperator) {
                System.out.printf("Result: %.2f%n", result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (response.equals("no")) {
                break;
            }
        }

        scanner.close();
    }
}
