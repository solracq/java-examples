package com.javaexamples.ch9;

public class EmployeeBasePlusCommissionHeritance extends EmployeeByCommission
{
    private double baseSalary;

    public EmployeeBasePlusCommissionHeritance(String firstName, String lastName, String socialSecurityNumber, double netSells, double tariffComission, double baseSalary)
    {
        // The explicit call to the 'EmployeeByCommission' constructor.
        super(firstName, lastName, socialSecurityNumber, netSells, tariffComission);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary)
    {
        if (baseSalary >= 0.0)
            this.baseSalary = baseSalary;
        else
            throw new IllegalArgumentException("The Base Salary has to be  >= 0.0");
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    @Override // Indicate that his method overrides the 'income()' method from the superclass
    public double income()
    {
        // The below commented out instruction will error as private variables from a superclass cannot be used in a subclass.
        // return this.baseSalary + (tariffComission * netSells);
        return this.baseSalary + (getTariffComission() * getNetSells()); // the only way to use private variables from superclasses is through public get methods.
    }

    @Override  // Indicates that this method overwides the method of the 'EmployyByCommission' superclass.
    public String toString() 
    {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", "Employee for comission", getFirstName(), getLastName(),
                                                                                            "Social Security Number", getSocialSecurityNumber(),
                                                                                            "Net Sells", getNetSells(),
                                                                                            "Tariff Comission", getTariffComission(),
                                                                                            "Base Salary", this.baseSalary);
    }
}
