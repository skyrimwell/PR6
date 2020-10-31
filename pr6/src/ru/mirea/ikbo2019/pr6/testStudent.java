package ru.mirea.ikbo2019.pr6;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class testStudent {
    public static void insertionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i].getiDNumber();
            int j = i - 1;

            while (j >= 0 && arr[j].getiDNumber() > key) {
                arr[j + 1].setiDNumber(arr[j].getiDNumber());
                j = j - 1;
            }
            arr[j + 1].setiDNumber(key);
        }
    }

    public static void main(String[] args) throws IOException {
        Student[] s = new Student[10];

        System.out.print("Введите 10 значений iDNumber: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) {
            s[i] = new Student(Integer.parseInt(strs[i]));
        }

        insertionSort(s);

        for (int i = 0; i < 10; i++) {
            System.out.print(s[i].getiDNumber() + " ");
        }
    }
}