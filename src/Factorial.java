import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scanner.nextInt();
        if (num < 0) System.out.println("Please run the program again and enter a positive number");
        else {
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact *= i; // fact = fact * i would also work the same way
            }
            System.out.println("The factorial of " + num + " is: " + fact);
        }
    }
}