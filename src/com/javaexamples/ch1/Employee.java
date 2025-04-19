/** Employee class with employee data and salary process. 
 * Author: Carlos Q.
*/

package com.javaexamples.ch1;

public class Employee {
    private String name;
    private String lastName;
    private double monthlySalary;
    
    public Employee(String name_usr, String lastName_usr, double monthlySalary_usr) {
        name = name_usr;
        lastName = lastName_usr;
        if (monthlySalary_usr > 0.0)
            monthlySalary = monthlySalary_usr;
        else
            System.err.println("Salary must be bigger than zero!");
    }

    public void setName(String name_usr) {
        name = name_usr;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName_usr) {
        lastName = lastName_usr;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary_usr) {
        if (monthlySalary_usr > 0.0)
            monthlySalary = monthlySalary_usr;
        else
            System.err.println("Salary must be bigger than zero!");
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}