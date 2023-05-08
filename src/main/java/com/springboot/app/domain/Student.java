package com.springboot.app.domain;

public class Student {


    private String firstName;
    private String lastName;
    private int studentID;
    private String address;

    public Student(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName,String lastName,int studentID,String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.address = address;
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

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
