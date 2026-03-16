import java.util.Scanner;

public class level3q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Swapping
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Output
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}