import java.util.Scanner;

public class MultipleOfTen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.println("Enter the end of range: ");

        int end = scanner.nextInt();
        for(int i = start; i<=end;i++){
            if (i % 10 == 0){
                System.out.println(i);
            }
        }
    }
}
