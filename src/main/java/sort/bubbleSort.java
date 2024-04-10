package sort;

import java.util.Scanner;

public class bubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        System.out.println("Nhập sô lượng mảng: ");
        int n = sc.nextInt();
        a = new int[n];
        // nhạp array
        nhapArray(a);
        // đóng luồng
        sc.close(); //
        bubblesort(a);
    }

    public static void nhapArray(int[] a) {
        Scanner sc = new Scanner(System.in);
        int n = a.length;
        System.out.println("nhập mảng");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(a);
        sc.close();
    }

    public static void printarray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println("");
    }

    public static void bubblesort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            boolean check = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    check = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            printarray(i, a);
            if (!check) {
                break;
            }
        }
    }
}