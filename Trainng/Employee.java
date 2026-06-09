import java.util.Scanner;

class Employee
{
    int empId;
    String empName;
    double salary[] = new double[3];

    void getData()
    {
        Scanner sc = new Scanner(System.in);

        empId = sc.nextInt();
        sc.nextLine();

        empName = sc.nextLine();

        for(int i=0;i<3;i++)
        {
            salary[i] = sc.nextDouble();
        }
    }

    void display()
    {
        double total = 0;

        for(int i=0;i<3;i++)
        {
            total += salary[i];
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

        String rev = "";
        for(int i=empName.length()-1;i>=0;i--)
        {
            rev += empName.charAt(i);
        }

        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Total Salary : " + total);
        System.out.println("Average Salary : " + avg);
        System.out.println("Number of Vowels : " + vowels);
        System.out.println("Reversed Name : " + rev);
    }
}