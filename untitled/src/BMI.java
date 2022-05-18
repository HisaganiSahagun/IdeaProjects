import java.util.Scanner;

public class BMI {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        double weight;
        double height;
        double bmi;

        //ask user for height
        System.out.println("Enter you height in meters: ");
        height = sc.nextDouble();

        //ask use for weight
        System.out.println("Enter you weight in kilograms: ");
        weight = sc.nextDouble();

        //calculate bmi
        bmi=weight/(height*height);
        System.out.println("BMI="+ bmi);

        //check BMI
        if(bmi<18.5){
            System.out.println("The user is Underweight");
        }else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("The user is Normal weight");
        }else if(bmi>=25 && bmi<=29.9){
            System.out.println("The user is Overweight");
        }else{
            System.out.println("The user is Obese");
        }
    }
}