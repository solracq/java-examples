package com.javaexamples.ch9;

public class EmployeeByCommission extends Object 
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double netSells;
    private double tariffComission;

    // Setting class variables to 'Protected' to work with the sub-class, 'EmployeeBasePlusComissonProtected'
    // protected String firstName;
    // protected String lastName;
    // protected String socialSecurityNumber;
    // protected double netSells;
    // protected double tariffComission;

    public EmployeeByCommission(String firstName, String lastName, String socialSecurityNumber, double netSells, double tariffComission)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        setNetSells(netSells);
        setTariffComission(tariffComission);
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber()
    {
        return this.socialSecurityNumber;
    }

    public void setNetSells(double netSells)
    {
        if (netSells >= 0.0)
            this.netSells = netSells;
        else
            throw new IllegalArgumentException("The net sells should be >= 0.0");
    }

    public double getNetSells()
    {
        return this.netSells;
    }

    public void setTariffComission(double tariffComission)
    {
        if (tariffComission > 0.0 && tariffComission < 1.0)
            this.tariffComission = tariffComission;
        else
            throw new IllegalArgumentException("The tariff comission has to be > 0.0 and < 1.0");
    }

    public double getTariffComission()
    {
        return this.tariffComission;
    }

    public double income()
    {
        return this.tariffComission * this.netSells;
    }

    @Override  // Indicates that this method overwides the method of a superclass. We are reformating String when invoking '%s' using the object of this class.
    public String toString() 
    {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "Employee for comission", this.firstName, this.lastName,
                                                                                    "Social Security Number", this.socialSecurityNumber,
                                                                                    "Net Sells", this.netSells,
                                                                                    "Tariff Comission", this.tariffComission);
    }
}
