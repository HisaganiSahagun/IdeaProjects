import java.util.*;

class EmployeeDetail {
    private float salary, hours;

    public EmployeeDetail() {


        salary = 0;
        hours = 0;
    }

    public void getInfo( float sal, float hr) {


        salary = sal;
        hours = hr;
    }

    public float addSalary() {
        if(salary<10000) {
            salary = salary + 4000;
        }
        return salary;
    }

    public float addOvertime() {
        if(hours > 6) {
            salary = salary + 2000;
        }
        return salary;
    }
}

class TestEmployee {
    float salary;

    public TestEmployee(float sal) {
        salary = sal;
    }

    public void printSal() {
        System.out.println("Salary : " + salary);
    }
}

class Employee
{
    public static void main (String[] args)
    {
        EmployeeDetail emp = new EmployeeDetail();

        /* taking input of employee details */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill out employee Details");

        System.out.println("Enter Hourly Rate (PHP)");
        float salary = sc.nextFloat();
        System.out.println("Enter daily working hours:");
        float hours = sc.nextFloat();

        /* calling methods of EmployeeDetail class */
        emp.getInfo( salary, hours);
        salary = emp.addSalary();
        salary = emp.addOvertime();

        TestEmployee test = new TestEmployee(salary);  /* pass salary obtained from the methods of the EmployeeDetail class as parameter */
        test.printSal();  /* calling method of TestEmployee class to print final salary */
    }
}