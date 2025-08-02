import java.util.Scanner;

public class BitwiseRightshift {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Bitwise Right Shift Calculator");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = number >> 1;
        System.out.println("The result is: " + result);
    }
}
 
    

