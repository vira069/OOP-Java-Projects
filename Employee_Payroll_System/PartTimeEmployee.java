package Employee_Payroll_System;

public class PartTimeEmployee extends Employee {
    private int hourWorked;
    private double hourlyRate;
    public PartTimeEmployee(String empName, int empId, int hourWorked, int hourlyRate){
        super(empName,empId);
        this.hourWorked = hourWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourWorked * hourlyRate;
    }
}
