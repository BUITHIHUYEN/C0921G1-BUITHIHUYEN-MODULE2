package vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        Scanner luaChon = new Scanner(System.in);
        int input = luaChon.nextInt();
        switch (input) {
            case 1:
                int a = 10;
                int b = 17;
                for (int i=0;i<a;i++ ) {
                    for ( int j=0;j<b;j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
            case 2:
                int c = 5;
                for (int i=0;i<=c;i++) {
                    for (int j=0;j<=i;j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            case 3:
                for ( int i = 0; i<7;i++) {
                    for ( int j =i ; j<7;j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("  ");

                }
        }
    }
}
