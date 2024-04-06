package Employee_Payroll_System;

abstract class Employee {
    private String empName;
    private  int   empId;

    public Employee(String empName,int empId){
        this.empName = empName;
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }
    public abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee[name=" +empName+ "id="+empId+ "Salary= "+calculateSalary()+"]";
    }

}
