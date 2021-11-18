package bai_15_debug_ung_dung.bai_tap.ill_egaly_triangle_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        while (true) {
            try {
                System.out.println("Nhập cạnh a : ");
                a = scanner.nextDouble();
                System.out.println("Nhập cạnh b: ");
                b = scanner.nextDouble();
                System.out.println("Nhập cạnh c :");
                c = scanner.nextDouble();
                Triangle triangle = new Triangle(a, b, c);

                break;

            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}
