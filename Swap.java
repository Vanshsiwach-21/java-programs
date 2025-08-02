import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swap stataion");
        System.out.println("Enter A number: ");
        int A = input.nextInt();   
        System.out.println("Enter B number: ");
        int B = input.nextInt();

        int C = A;
        A = B;
        B = C;
        System.out.println("After swapping A is: " + A);
        System.out.println("after swapping B is : " + B);



    }
}
