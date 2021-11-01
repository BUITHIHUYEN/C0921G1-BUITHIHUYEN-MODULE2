package introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate,usd,vnd;
        rate = 23000;
        System.out.println("Enter giá trị đô :");
       usd = scanner.nextDouble();
       vnd= usd*rate;
        System.out.println(vnd);
    }
}
