import java.util.Scanner;

public class level2q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        double distanceInFeet = sc.nextDouble();

        // Conversions
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        // Output
        System.out.println("The distance in yards is " + yards +
                           " while the distance in miles is " + miles);

        sc.close();
    }
}