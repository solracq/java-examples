package com.javaexamples.ch10;

import com.javaexamples.ch9.EmployeeBasePlusCommission_Best;
import com.javaexamples.ch9.EmployeeByCommission;

/* Assinging a reference of the superclass and sublass to the superclass and subclass variables */

public class PoliformismTest {
    public static void main(String[] args) {
        // Assign a superclass reference to a superclass variable
        EmployeeByCommission employeeByCommission = new EmployeeByCommission("Sue", "Smith", "222-22-2222", 10000, 0.06);

        // Assign a subclass reference to a subclass variable
        EmployeeBasePlusCommission_Best employeeBasePlusCommission = new EmployeeBasePlusCommission_Best("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // Invoke toString from a superclass object, using a variable of the superclass
        System.out.printf("%s %s:\n\n%s\n\n", "Llamada a toString de EmployByComission con referencia de la superclase ", "a un objeto de la superclase", employeeByCommission.toString());

        // Invoke toString from a subclass object, using a variable of the subclass
        System.out.printf("%s %s:\n\n%s\n\n", "Llamada a toString de EmployBasePlusComision con referencia de la subclase ", "a un objeto de la subclase", employeeBasePlusCommission.toString());

        // Invoke toString from a object of the sublcass, using a variable of the superclass
        EmployeeByCommission employeeByCommission2 = employeeBasePlusCommission;
        System.out.printf("%s %s:\n\n%s\n\n", "Llamada a toString de EmployBasePlusComision con referencia de superclase ", "a un objeto de la subclase", employeeByCommission2.toString());
    }
}
