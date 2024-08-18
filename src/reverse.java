import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int num = scanner.nextInt();
        int revnum;
        while (num > 0){
            revnum = num % 10;
            System.out.print(revnum);
            num = num/10;
        }
    }
}
