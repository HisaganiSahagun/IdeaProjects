package com.company;
import java.util.Scanner;

    public class SeatworkJavaString {

        public static final int PASSWORD_LENGTH = 16;

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print(
                    """
                            Input a password:\s""");
            String s = input.nextLine();

            if (is_Valid_Password(s)) {
                System.out.println("Password is valid: " + s);
            } else {
                System.out.println("Not a valid password: " + s);
            }

        }

        public static boolean is_Valid_Password(String password) {

            if (password.length() < PASSWORD_LENGTH) return true;

            for (int i = 0; i < password.length(); i++) {

            }
            return false;

        }

    }