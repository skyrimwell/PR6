package ru.mirea.ikbo2019.pr6.ch2;

import ru.mirea.ikbo2019.pr6.Student;

public class StudentV2 implements Comparable<StudentV2>{
    private double GPA;

    public StudentV2(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(StudentV2 o) {
        return -Double.compare(this.GPA, o.GPA);
    }
}