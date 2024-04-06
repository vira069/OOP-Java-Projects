package Employee_Payroll_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Nick ",1 , 87000.0 );
        FullTimeEmployee emp2 = new FullTimeEmployee("Joy ", 2 , 78000.0);
        FullTimeEmployee emp3 = new FullTimeEmployee("Veer ", 3 , 98000.0);
        PartTimeEmployee emp4 = new PartTimeEmployee("Jack ", 4 , 48, 800);
        PartTimeEmployee emp5 = new PartTimeEmployee("Kiran ",5 , 56,800);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        payrollSystem.addEmployee(emp4);
        payrollSystem.addEmployee(emp5);
        System.out.println("Initial Employees Details:");
        payrollSystem.displayEmployees();
        System.out.println("Removing Employees :");
        System.out.println("Enter Employee ID :");
        int removeId = sc.nextInt();
        payrollSystem.removeEmployee(removeId);
        System.out.println("Remaining Employees :");
        payrollSystem.displayEmployees();
    }
}
