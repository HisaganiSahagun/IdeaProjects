public class Account
{
    String Name;
    String Surname;
    long Telephone_Number;
    double Balance;
    double balance2;
    Account()
    {
        this.Name = "Hisagani";
        this.Surname = "Sahagun";
        this.Telephone_Number = 7894;
    }
    public void setBalance(double amount)
    {
        this.Balance = amount;
    }
    public double getBalance()
    {
        return Balance;
    }
    public Account(double balance) {
        balance2 = balance;
        Balance = balance;
    }
    public void display() {
        System.out.println("Name: " + Name );
        System.out.println("Surname: " + Surname );
        System.out.println("Phone Number: " + Telephone_Number );
    }
    public void deposit(double deposit) {
    }
    public void withdraw(double amount){

    }
}