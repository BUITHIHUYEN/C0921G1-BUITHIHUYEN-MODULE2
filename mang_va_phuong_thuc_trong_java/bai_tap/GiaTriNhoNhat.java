package mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhâp kích thước mảng");
            n = scanner.nextInt();
        } while (n > 10);
        int arr1[] = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("nhập phần tử thứ " + i);
            arr1[i] = scanner.nextInt();
        }
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
        }

        System.out.println("giạ trị nhỏ nhất là :" + min);

    }

}


