import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Odd or Even Checker Program\n");
        System.out.print("Enter an integer to check if it is odd or even: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number  is even.");
        } else {
            System.out.println("The number  is odd.");
        }
    }
}
