package com.gs.test;

public class Employee {

    private String firstName;
    private String lastName;
    private String departName;
    private String emailAddress;



    public Employee(String firstName, String lastName, String departName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.departName = departName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    @Override
    public String toString() {
        return "com.gs.test.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departName='" + departName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
