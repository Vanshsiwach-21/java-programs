import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to my world\n");
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();
        System.out.println("enter second number: ");
        int secondNum = input.nextInt();

        int add = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mul = firstNum * secondNum;
        int div = firstNum / secondNum;
        int mod = firstNum % secondNum;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
    }
}
