import java.util.Scanner;

public class Complete {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner inputNum = new Scanner(System.in);
        int number = inputNum.nextInt();

        if (number > 0) {
            System.out.printf("%s is positive.\n", number);
        } else if (number < 0) {
            System.out.printf("%s is negative.\n", number);
        } else {
            System.out.printf("%s is neither positive nor negative.\n", number);
        }

        System.out.println("Application finished.");
    }
}
