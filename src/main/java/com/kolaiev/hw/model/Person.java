package com.kolaiev.hw.model;

public class Person {

    private int person_id;
    private String person_name;
    private int age;

    public Person(int person_id, String person_name, int age) {
        this.person_id = person_id;
        this.person_name = person_name;
        this.age = age;
    }

    public Person() {

    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
