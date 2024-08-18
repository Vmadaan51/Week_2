import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int stud = scanner.nextInt();
        for (int i = 1; i <= stud; i++) {
            System.out.println("Enter the name of the student:");
            String name = scanner.next();
            System.out.println("Please enter your marks in Mathematics:");
            double math = scanner.nextDouble();
            System.out.println("Please enter your marks in Physics:");
            double phys = scanner.nextDouble();
            System.out.println("Please enter your marks in Chemistry:");
            double chem = scanner.nextDouble();
            double all = math + phys + chem;
            double mp = math + phys;
            if (math >= 60 && phys >= 50 && chem >= 40 && all>= 200 || mp >= 150){
                System.out.println(name + " is eligible");
            }
            else System.out.println(name + " is not eligible");
        }
    }
}