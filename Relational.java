import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to your driving lincense\n");
        System.out.println("plese enter your age:  ");
         int age = input.nextInt();
         if (age >= 18) {
             System.out.println("you are eligible for driving lincense");
         } else {
             System.out.println("you are not eligible for driving lincense");
         }
    }
}
