package ru.mirea.ikbo2019.pr6.ch3;

public class StudentV3 {
    private int iDNumber;
    private double GPA;

    public StudentV3(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
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
                "iDNumber=" + iDNumber +
                ", GPA=" + GPA +
                '}';
    }
}