package com.javaexamples.ch9;

/* EmployeeBasePlusCommissionProtected() inherits 'protected' instance variables from 'EmployeeByCommission'.*/

public class EmployeeBasePlusCommissionProtected extends EmployeeByCommission 
{
    protected double baseSalary;

    public EmployeeBasePlusCommissionProtected(String firstName, String lastName, String socialSecurityNumber, double netSells, double tariffComission, double baseSalary)
    {
        super(firstName, lastName, socialSecurityNumber, netSells, tariffComission);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary)
    {
        if (baseSalary >= 0.0)
            this.baseSalary = baseSalary;
        else
            throw new IllegalArgumentException("The Base salary has to be >= 0");
    }

    public double getBaseSalary()
    {
        return this.baseSalary;
    }

    @Override // Indicate that his method overrides the 'income()' method from the superclass
    public double income()
    {
        // The below commented out instruction will error as private variables from a superclass cannot be used in a subclass.
        // return this.baseSalary + (tariffComission * netSells); // Commented out since the instance variables are no longer 'private' in the superclass
        return this.baseSalary;
    }

    @Override  // Indicates that this method overwides the method of a superclass. We are reformating String when invoking '%s' using the object of this class.
    public String toString() 
    {
        // return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", "Employee for comission", this.firstName, this.lastName,
        //                                                                                     "Social Security Number", this.socialSecurityNumber,
        //                                                                                     "Net Sells", this.netSells,
        //                                                                                     "Tariff Comission", this.tariffComission,
        //                                                                                     "Base Salary", this.baseSalary);            // Commented out since the instance variables are no longer 'private' in the superclass
        return String.format("%s%10.2f", "Employee for commision", this.baseSalary);
    }
}
