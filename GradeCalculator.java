import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grade calculator\n");
        System.out.println("Enter your percentage:  ");
        double percentage = input.nextDouble();

        if (percentage > 90 ) {
        System.out.println("contrats you scored A grade");
        } else if (percentage > 80 ) {
            System.out.println("congrats you got b+ grade");
        } else if (percentage > 70 ) {
            System.out.println("congrats you got b grade");
        } else if (percentage > 60 ) {
            System.out.println("congrats you got c grade");
        } else if (percentage >= 30 ){
            System.out.println("good you got d grade improve more");
        } else {
            System.out.println("soory but you are fail do hard work");
        }
    }
}
