package com.company;
import java.util.Scanner;

public class JavaString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Password ");
        String password = scanner.nextLine();

        if ((password.length()) == 6) {
            System.out.println("Password is valid");
        } else if ((password.length()) != 6){
            System.out.println("Invalid");