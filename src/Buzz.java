import java.util.Scanner;

public class Buzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a buzz number or not");
        int  num = scanner.nextInt();
        if (num % 7 == 0 || num % 10 == 7) System.out.println("Number is a Buzz number");
        else System.out.println("Not a buzz number");
    }
}
