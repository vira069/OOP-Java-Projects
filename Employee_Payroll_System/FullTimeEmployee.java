package Employee_Payroll_System;

public class FullTimeEmployee extends Employee{

    private double monthlySalary;

  public FullTimeEmployee(String empName, int empId, double monthlySalary){
      super(empName,empId);
       this.monthlySalary = monthlySalary;
  }
  @Override
  public double calculateSalary(){
      return monthlySalary;
  }

}
