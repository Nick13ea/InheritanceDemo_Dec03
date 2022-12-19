package com.company.inheritanceDemo.StudentInheritance;

public class AddressStudent
{
    private String address1;
    private String address2;
    private String postalCode;
    private String city;
    private String province;
    private String country;

    public AddressStudent(String address1, String address2, String postalCode, String city, String province, String country) {
        this.address1 = address1;
        this.address2 = address2;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "AddressStudent{" +
                "address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
