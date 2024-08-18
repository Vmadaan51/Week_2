import java.util.Scanner;

public class Fibonnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        int f = 0;  // First Fibonacci number
        int s = 1;  // Second Fibonacci number

        System.out.println(f);  // Print 0
        System.out.println(s);  // Print 1

        for (int i = 1; i <= num - 2; i++) {
            int fib = f + s;  // Calculate the next Fibonacci number
            System.out.println(fib);  // Print the new Fibonacci number
            f = s;  // Update `f` to be the previous `s`
            s = fib;  // Update `s` to be the new Fibonacci number
        }
    }
}
