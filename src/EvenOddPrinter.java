import java.util.Scanner;

public class EvenOddPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        System.out.println("Even numbers:");
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int i = 0; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        input.close();
    }
}
