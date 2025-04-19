package com.javaexamples.ch9;

public class EmployeeBasePlusCommissionTest 
{
    public static void main(String[] args) {
        EmployeeBasePlusCommission employee = new EmployeeBasePlusCommission("Bob", "Lewis", "333-33-3333", 5000, 0.04);
        
        System.out.println("Information of the Employee");
        System.out.printf("%s %s\n", "First Name is: ", employee.getFirstName());
        System.out.printf("%s %s\n", "Last Name is: ", employee.getLastName());
        System.out.printf("%s %s\n", "The Social Security Number is: ", employee.getSocialSecurityNumber());
        System.out.printf("%s %s\n", "The Net Sells are: ", employee.getNetSells());
        System.out.printf("%s %s\n", "The Tariff Comission is: ", employee.getTariffComission());
        System.out.printf("%s %s\n", "The Base Salary is: ", employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("\n%s:\n\n%s\n", "Updated Employee Information, through overriding toString method", employee.toString());

        // Create object with inheritance
        EmployeeBasePlusCommissionHeritance employeeH = new EmployeeBasePlusCommissionHeritance("Lorr", "Smith", "555-55-5555", 150000, 0.06, 500);
        System.out.printf("\n%s:\n\n%s\n", "Employee information using heritance", employeeH.toString());

        // Create object with protected variables in super-class
        EmployeeBasePlusCommissionProtected employeeP = new EmployeeBasePlusCommissionProtected("Bob", "Dylan", "999-99-9999", 20000, 0.07, 800);
        System.out.printf("\n%s:\n\n%s\n", "Employee information using protected variables", employeeP.toString());

        EmployeeBasePlusCommission_Best employeeBest = new EmployeeBasePlusCommission_Best("Amy", "Smith", "777-77-7777", 8000, 0.05, 200);
        System.out.printf("\n%s:\n\n%s\n", "Employee information using best upt to dev standards", employeeBest.toString());
    }    
}
