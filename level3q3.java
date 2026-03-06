import java.util.Scanner;

public class level3q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        double salary = sc.nextDouble();
        double bonus = sc.nextDouble();

        // Calculation
        double income = salary + bonus;

        // Output
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +
                           ". Hence Total Income is INR " + income);

        sc.close();
    }
}