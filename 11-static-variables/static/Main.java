
public class Main {
  
    public static void main(String[] args) {

        Employee zack = new Employee("Zack", "Programmer");
        Employee gio = new Employee("Gio", "Analyst");
        Employee thomas = new Employee("Thomas", "Specialist");

        System.out.println(Employee.getHiredCount());

        // Employee.COMPANY_NAME = "Hi"; // not possible as it is a constant
        doStuff();
    }

    public static void doStuff() {

    }  
}
