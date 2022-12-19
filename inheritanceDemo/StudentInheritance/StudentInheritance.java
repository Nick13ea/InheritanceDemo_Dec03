package com.company.inheritanceDemo.StudentInheritance;
//getters n setters r always kept public
//usually we keep the setters, if there is default properties like students have name always
//u will use n pass through constructor nd we can delete setters
//validation is always done before calling the constructor
public class StudentInheritance
{
    private String name;
    private String age;
    private String schoolName;
   // private String address;
    private float fees;
    private String course;
    private AddressStudent addressStudent;

    public StudentInheritance(String name, String age, String schoolName, float fees, String course, AddressStudent addressStudent) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
        this.fees = fees;
        this.course = course;
        this.addressStudent=addressStudent;
    }

    public String getName() {
        return name;
    }

    public AddressStudent getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(AddressStudent addressStudent) {
        this.addressStudent = addressStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentInheritance{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", fees=" + fees +
                ", course='" + course + '\'' +
                ", addressStudent=" + addressStudent +
                '}';
    }
}
