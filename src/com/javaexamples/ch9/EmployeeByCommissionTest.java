package com.javaexamples.ch9;

public class EmployeeByCommissionTest 
{    
    public static void main(String[] args) 
    {
        EmployeeByCommission employee = new EmployeeByCommission("Sue", "Jones", "222-22-2222", 10000, 0.06);
        
        System.out.println("Information of the Employee");
        System.out.printf("%s %s\n", "First Name is: ", employee.getFirstName());
        System.out.printf("%s %s\n", "Last Name is: ", employee.getLastName());
        System.out.printf("%s %s\n", "The Social Security Number is: ", employee.getSocialSecurityNumber());
        System.out.printf("%s %s\n", "The Net Sells are: ", employee.getNetSells());
        System.out.printf("%s %s\n", "The Tariff Comission is: ", employee.getTariffComission());

        employee.setNetSells(500);
        employee.setTariffComission(.1);

        System.out.printf("\n%s:\n\n%s\n", "Updated Employee Information, through overriding toString method", employee);
    }
    
}
