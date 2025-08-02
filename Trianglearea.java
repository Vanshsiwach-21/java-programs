import java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Triangle Area Calculation Program\n");
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble(); 
        double area = 0.5 * base * height;

        System.out.println("The area of the triangle is: " + area);
        input.close();
    }
}
