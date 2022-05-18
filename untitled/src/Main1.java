 import java.util.Scanner;
public class Main1
{
    public static void main(String[] args)
    {
        Account acc = new Account();
        int option = 0;
        double deposit = 0;
        double temp = 0;
        double withdraw = 0;
        while (option != 5)
        {
            System.out.println("What do you want to do?");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Display Balance");
            System.out.println("4 - Display Details");
            System.out.println("5 - Exit");
            System.out.println("Select: ");
            option = new Scanner(System.in).nextInt();
            if(option == 1)
            {
                System.out.println("enter amount to deposit: ");
                deposit = new Scanner(System.in).nextDouble();
                acc.deposit(deposit);
            }
            else if(option == 2)
            {
                System.out.println("enter amount to withdraw: ");
                withdraw = new Scanner(System.in).nextDouble();
                temp = temp - withdraw;
            }
            else if(option == 3)
            {
                acc.setBalance(deposit);
                temp = temp + acc.getBalance();
                System.out.println("Balance: " + temp);
            }
            else if(option == 4)
            {
                acc.display();
            }
            else if(option == 5)
            {
                System.out.println("Exit Program...");
            }
        }
    }
}

