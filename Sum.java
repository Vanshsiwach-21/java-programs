import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Sum Calculator");
        System.out.println("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");    
        int secondNumber = input.nextInt();

         int Sum = firstNumber + secondNumber;
        System.out.println("The sum of your numbers is: " + Sum);
    }
}