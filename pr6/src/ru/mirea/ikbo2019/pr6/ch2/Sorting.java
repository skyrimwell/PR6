package ru.mirea.ikbo2019.pr6.ch2;

import ru.mirea.ikbo2019.pr6.ch2.StudentV2;

public class Sorting {
    public Sorting(StudentV2[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(StudentV2[] arr, int low, int high) {
        if (arr.length == 0 || low >= high)
            return;

        int middle = low + (high - low) / 2;
        StudentV2 pivot = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i].compareTo(pivot) < 0)
                i++;

            while (arr[j].compareTo(pivot) > 0)
                j--;

            if (i <= j) {
                StudentV2 temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
}