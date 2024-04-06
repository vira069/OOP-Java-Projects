package Employee_Payroll_System;

import java.util.ArrayList;

public class PayrollSystem {
    ArrayList<Employee> employeeList;
    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int empId){
        Employee employeeToRemove = null;
        for(Employee employee : employeeList){
            if(employee.getEmpId()==empId){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null ){
            employeeList.remove(employeeToRemove);
        }
    }
    public void displayEmployees(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}

