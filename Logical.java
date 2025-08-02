import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     System.out.println("welcome to ticket discount centre");
     System.out.println("please enter your age: ");
     int age = input.nextInt();
     System.out.println("are you a female? (true/false) ");
        boolean isFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("you got 50% discount");
        } else if (isFemale) {
            System.out.println("you got 60% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("you got 90% discount");
        } else {
            System.out.println("you got no discount");
        }
    }
}
