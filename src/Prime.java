import  java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = scanner.nextInt();
        if (num % 1 == 0  && num % num == 0){
            System.out.println("The number is prime");

        }
        else System.out.println("The number is not prime");
    }
}
