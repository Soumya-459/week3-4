import java.util.Scanner;

public class level2q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Unit Price: ");
        int unitPrice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Calculation
        int totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice);
    }
}