package lop_va_doi_tuong_trong_java.bai_tap.bai_1_phuong_trinh_bac_2;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a : ");
        int a = scanner.nextInt();
        System.out.println("nhập b : ");
        int b = scanner.nextInt();
        System.out.println("nhập c : ");
        int c = scanner.nextInt();
        XayDungPhuongTrinhBacHai ptbh = new XayDungPhuongTrinhBacHai(a,b,c);
        ptbh.kiemTra();

    }
}
