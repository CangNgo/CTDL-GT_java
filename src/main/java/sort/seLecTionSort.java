package sort;

import java.util.Scanner;

public class seLecTionSort extends bubbleSort {
    // chạy từ đầu đến cuối mảng
    // tại vòng lặp thứ i tìm phần tử nhỏ nhất từ [i+1, n-1] nếu nhỏ hơn a[i] thì
    // đổi chổ cho a[i]
    // sau vòng lặp thứ i thì dãy [0,i] đã được sắp xếp
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] a = { 5, 3, 2, 7, 8, 1, 2 };
            selectionsort(a);
        }
    }

    public static void selectionsort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int minInDex = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] < a[minInDex]) {
                    minInDex = j;
                }
            }
            if (minInDex != i) {
                int temp = a[i];
                a[i] = a[minInDex];
                a[minInDex] = temp;
            }
            printarray(i, a);
        }
    }

}
