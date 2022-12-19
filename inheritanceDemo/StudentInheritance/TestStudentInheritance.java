package com.company.inheritanceDemo.StudentInheritance;

public class TestStudentInheritance {
    public static void main(String[] args) {
        AddressStudent addressStudent = new AddressStudent("6295",
                "Knight Street",
                "V5P3V9",
                "Vancouver",
                "BC", "Canada");
        /*
        * to test setters
        * use
        * this(name,age);
        *
        * */
        StudentInheritance studentInheritance = new StudentInheritance(
                "Nikhil",
                "20", "Cambridge", 213123f, "Software Engineering", addressStudent);
        System.out.println(studentInheritance);
    }
}