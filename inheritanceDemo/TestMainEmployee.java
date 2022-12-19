package com.company.inheritanceDemo;

public class TestMainEmployee {
    public static void main(String[] args) {

        //address object then pass it into another object
Address address=new Address("6295",
        "Knight Street",
        "V5P3V9",
        "Vancouver",
        "BC", "Canada");

        EmployeeInheritance employeeInheritance = new EmployeeInheritance
                (
                        101,
                        "Nikhil",
                        "Salaria",
                                address,
                        12345.45f,
                        "6479141632",
                        "ns@gmail.com",
                        "Software Engineer"
                );
        System.out.println(employeeInheritance);
    }
}
