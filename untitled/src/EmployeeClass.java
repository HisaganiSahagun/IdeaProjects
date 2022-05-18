import java.util.Scanner;
public class EmployeeClass {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            {

                Float num1, num2;

                //ask the user an input
                System.out.println("");
                System.out.println("Please fill out Employee Details");
                System.out.println("Enter Hourly Rate (PHP):");
                num1 = sc.nextFloat();
                System.out.println("Enter daily working Hours:");
                num2 = sc.nextFloat();

                //This code will store the output of num1 and num2 and will pass to the setter and getter
                salCalculator i = new salCalculator(num1, num2);

                //print the computed salary
                System.out.println("Computing Monthly Salary.....");
                System.out.println("Result " + i.computeMonthly());

                //methods
                i.addSalary();
                i.addOvertimePay();
            }
        }
    } //end of main

} //end of class

