package org.example;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }


    @Override
    public String toString() {
        return "Student{" + "\n" +
                "id=" + id + "\n" +
                ", name='" + name + '\'' + "\n" +
                ", ph=" + ph + "\n" +
                ", add=" + add + "\n" +
                '}';
    }
}
