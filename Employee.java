import java.util.Scanner;
 class Employee {
    int id;
    String name;
    double salary;

    void details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        name=sc.nextLine();
        System.out.println("Enter Your Id:");
        id=sc.nextInt();
        System.out.println("Enter Your Salary:");
        salary=sc.nextDouble();
    }

    void output()
    {
        System.out.println("Your Name:"+name);
        System.out.println("Your Id:"+id);
        System.out.println("Your Salary:"+salary);
    }
}
class manager extends Employee
{
    public static void main(String[] args) {
        manager obj=new manager();
        obj.details();
        obj.output();
    }
}
