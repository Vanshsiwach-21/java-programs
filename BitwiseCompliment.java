import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Bitwise Complement Calculator"); 
        System.out.print("Enter a number: ");
        int number = input.nextInt();   
        
        int result = ~number;
        System.out.println("the result is: " + result);
    }
}
