import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Float Multiplication Program\n");
        System.out.print("Enter first floating-point number: ");
        float firstNum = input.nextFloat();
        System.out.print("Enter second floating-point number: ");
        float secondNum = input.nextFloat();

        double mul = firstNum * secondNum;

        System.out.println("Multiplication Result: " + mul);
    }
}
