package com.example.admin.recyclerviewlistview;

/**
 * Created by admin on 9/12/2017.
 */

public class Person {

    String name, gender;
    //height in inches
    int age, height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person(String name, int age, String gender, int height) {

        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }
}
