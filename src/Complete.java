import java.util.Scanner;

public class Complete {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner inputNum = new Scanner(System.in);
        int number = inputNum.nextInt();

        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is not positive.");
        }

        System.out.println("Application finished.");
    }
}
