package ru.mirea.ikbo2019.pr6.ch3;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;
        import java.util.Scanner;

public class testStudentV3 {
    private static void merge(StudentV3[] arr, int l, int m, int r, int type)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        StudentV3[] L = new StudentV3[n1];
        StudentV3[] R = new StudentV3[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (type == 1) {
                if (L[i].getiDNumber() <= R[j].getiDNumber()) {
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                }
            }
            else {
                if (L[i].getGPA() <= R[j].getGPA()) {
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                }
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private static void sort(StudentV3[] arr, int l, int r, int type)
    {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m, type);
            sort(arr, m + 1, r, type);
            merge(arr, l, m, r, type);
        }
    }

    private static void sorting(StudentV3[] s) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Выберите вариант сортировки:\n1 - Сортировка по iDNumber\n2 - Сортировка по GPA\n3 - Вывести массив на экран\nВвод: ");
        int c = sc.nextInt();

        switch (c) {
            case 1: {
                sort(s, 0, s.length - 1, 1);
                System.out.println(Arrays.toString(s));
                sorting(s);
            }
            case 2: {
                sort(s, 0, s.length - 1, 2);
                System.out.println(Arrays.toString(s));
                sorting(s);
            }
            case 3: {
                System.out.println(Arrays.toString(s));
                sorting(s);
            }
            default: {
                System.out.println("Вариант не найден! Повторите ввод.\n");
                sorting(s);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        StudentV3[] s = new StudentV3[10];

        System.out.print("Введите 10 значений iDNumber: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) {
            s[i] = new StudentV3(Integer.parseInt(strs[i]));
        }

        System.out.print("Введите 10 значений GPA по порядку для каждого iDNumber: ");

        lines = br.readLine();
        strs = lines.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) {
            s[i].setGPA(Double.parseDouble(strs[i]));
        }

        System.out.println(Arrays.toString(s));

        sorting(s);
    }
}