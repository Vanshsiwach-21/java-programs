import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Bitwise AND Calculator");
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");    
        int secondNumber = input.nextInt();

        int result = firstNumber & secondNumber;
        System.out.println("The result is: " + result);
    }
}
