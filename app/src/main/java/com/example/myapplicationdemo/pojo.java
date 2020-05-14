package com.example.myapplicationdemo;

public class pojo {
    String name,rollno,qualification;

    public pojo(String name, String rollno, String qualification) {
        this.name = name;
        this.rollno = rollno;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
