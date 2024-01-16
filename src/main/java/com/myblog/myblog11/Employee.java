package com.myblog.myblog11;

public class Employee {

    private String Name;
    private int age;

    private String city;

    public Employee(String Name, int age, String city) {
     this.Name=Name;
     this.age=age;
     this.city=city;
    }



    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}