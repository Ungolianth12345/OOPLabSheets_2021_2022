package labsheet9.exercise1;

//TestPolymorphism.java
/*A driver class to test out the Employee, Boss and HourlyWorker classes*/

import javax.swing.*;

public class TestPolymorphism {
    public static void main(String args[])
    {
        StringBuilder output = new StringBuilder();
        Employee[] employees = new Employee[3];

        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);

        employees[0] = b1;
        employees[1] = hw1;

        SelfEmployedWorker sew1 = new SelfEmployedWorker("Richard", "Braintree");

        employees[2] = sew1;

        for (Employee employee : employees) {
            output.append(employee.toString()).append(" and the earnings were €").append(String.format("%.2f",
                    employee.earnings())).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
    }
}