import java.util.Scanner;

public class OddevenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Odd/Even Bitwise Calculator");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if ((number & 1) == 0) {
            System.out.println("The number is even.");
        } else if ((number & 1) == 1) {
            System.out.println("The number is odd.");
        }
    }
}
