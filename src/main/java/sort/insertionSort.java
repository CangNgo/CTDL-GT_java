package sort;

import java.util.Scanner;

public class insertionSort extends bubbleSort {
    public static void main(String[] args) {
        int[] a;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("nhập số lượng mảng");
            int n = sc.nextInt();
            a = new int[n];
        }
        nhapArray(a);
        insertionsort(a);
    }

    public static void insertionsort(int[] a) {
        int length = a.length;
        for (int i = 1; i < length; i++) {
            int ai = a[i];
            int j = i - 1;
            while (j > 0 && a[j] > ai) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            printarray(i, a);
        }
    }
}
