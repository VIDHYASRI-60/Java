import java.util.Scanner;

class Employee1
{
    int empId;
    String empName;
    double monthlySalary[] = new double[3];

    void input()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID : ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        empName = sc.nextLine();

        System.out.println("Enter 3 Month Salaries :");
        for(int i=0;i<3;i++)
        {
            monthlySalary[i] = sc.nextDouble();
        }
    }

    void display()
    {
        double total = 0;

        for(int i=0;i<3;i++)
        {
            total = total + monthlySalary[i];
        }

        double avg = total / 3;

        int vowels = 0;
        for(int i=0;i<empName.length();i++)
        {
            char ch = Character.toLowerCase(empName.charAt(i));

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vowels++;
            }
        }

        String reverse = "";
        for(int i=empName.length()-1;i>=0;i--)
        {
            reverse = reverse + empName.charAt(i);
        }

        System.out.println("\nEmployee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Total Salary : " + total);
        System.out.println("Average Salary : " + avg);
        System.out.println("Number of Vowels : " + vowels);
        System.out.println("Reversed Name : " + reverse);
    }
}

public class Employee
{
    public static void main(String[] args)
    {
        Employee1 e = new Employee1();

        e.input();
        e.display();
    }
}