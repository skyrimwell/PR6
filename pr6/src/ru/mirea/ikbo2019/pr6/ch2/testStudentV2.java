package ru.mirea.ikbo2019.pr6.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class testStudentV2 {
    public static void main(String[] args) throws IOException {
        StudentV2[] s = new StudentV2[10];

        System.out.print("Введите 10 значений GPA: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) {
            s[i] = new StudentV2(Double.parseDouble(strs[i]));
        }

        System.out.println("Before: " + Arrays.toString(s));

        new Sorting(s);

        System.out.println("After: " + Arrays.toString(s));
    }
}