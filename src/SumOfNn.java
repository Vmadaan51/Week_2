import java.util.Scanner;

public class SumOfNn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a range:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i =1; i<= n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}