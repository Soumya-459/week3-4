import java.util.Scanner;

public class levl3q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        double fahrenheit = sc.nextDouble();

        // Conversion
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

        sc.close();
    }
}