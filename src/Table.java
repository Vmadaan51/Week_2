import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to print table of:");
        int num = scanner.nextInt();
        System.out.println("Table of " + num + ": ");
        for (int i=1; i<=10;i++){
            int tab = num * i;
            System.out.println( num + " * "+ i + "= " + tab);
        }
    }
}
