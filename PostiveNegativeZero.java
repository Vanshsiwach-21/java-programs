import java.util.Scanner;

public class PostiveNegativeZero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Positive, Negative, or Zero Checker Program\n");
        System.out.println("Enter a number to check if it is positive, negative, or zero: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
