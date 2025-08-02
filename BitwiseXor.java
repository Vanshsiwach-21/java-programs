import java.util.Scanner;
public class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Bitwise XOR Calculator");
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        int result = firstNumber ^ secondNumber;
        System.out.println("The result is: " + result);
    }
}
