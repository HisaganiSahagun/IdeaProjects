import java.util.Scanner;

public class JavaStringManipulation {
    public static String swapCharacters(String userInput) {
        int length = userInput.length();

        if (length <= 1) {
            return userInput;
        } else {

            return userInput.charAt(length - 1) + userInput.substring(1, length - 1) + userInput.charAt(0);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a string : ");

        String userInput = scanner.next();

        System.out.println("The New String: " + swapCharacters(userInput));
    }
}
