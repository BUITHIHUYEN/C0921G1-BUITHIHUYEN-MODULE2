package lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài a: ");
        int a = scanner.nextInt();
        System.out.println("nhập chiều dài b :");
        int b = scanner.nextInt();
        TaoLopHinhChuNhat hcn = new TaoLopHinhChuNhat(a,b);
        System.out.println( hcn.getArea());
        System.out.println(hcn.getPerimeter());
        System.out.println(hcn.display());


    }
}
