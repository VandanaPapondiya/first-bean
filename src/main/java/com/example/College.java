package com.example;

public class College {

    private Student student;

    // Constructor Injection
    public College(Student student) {
        this.student = student;
    }

    /*
       College needs a Student object
       Without Student, College cannot work
        ➡ This is called Dependency

       -So yes
👉     College depends on Student
     */

    public void startClass() {
        student.study();
        System.out.println("Class started");
    }
}