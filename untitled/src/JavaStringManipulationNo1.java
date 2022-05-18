package com.company;

        import java.util.Scanner;

public class JavaStringManipulationNo1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a String");
        String input1 = scanner.nextLine();

        System.out.println("Replace something in the String");
        String input2 = scanner.nextLine();

        boolean userInput;
        userInput = input1.contains(input2);

        if(userInput) {
            System.out.println("Replace " + input2 + " with what?");

            String input3 = scanner.nextLine();
            System.out.println("The new String : " + input1.replace(input2, input3));
        }else{
            System.out.println("String/Character to replace is not found.");
        }
    }
}