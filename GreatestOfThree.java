import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to world of three ");
    System.out.println("Enter thr first number");
    int firstnum = input.nextInt();
     System.out.println("Enter thr second number");
    int secondnum = input.nextInt();
     System.out.println("Enter thr third number");
    int thirdnum = input.nextInt();

    if (firstnum >= secondnum && firstnum >= thirdnum) {
        System.out.println("The greatest number is: " + firstnum);
    } else if (secondnum >= firstnum && secondnum >= thirdnum) {
        System.out.println("The greatest number is: " + secondnum);
    } else {
        System.out.println("The greatest number is: " + thirdnum);
    }
    }
}
