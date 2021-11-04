package vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập n số nguyên ");
        int n = scanner.nextInt();
        int count = 0;
        int i = 2;
        while (count < n) {
            if (kiemTraSNT(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;

        }

    }

    public static boolean kiemTraSNT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}

