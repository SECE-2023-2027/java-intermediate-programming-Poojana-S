import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String empName=sc.next();
        double empSalary=sc.nextDouble();
        Employee emp = new Employee(empName, empSalary);
        String mName=sc.next();
        double mSalary=sc.nextDouble();
        double bonus=sc.nextDouble();
        Manager mgr = new Manager(mName,mSalary,bonus);
        System.out.println(emp.calculateSalary());
        System.out.println(mgr.calculateSalary());
        sc.close();
    }
}