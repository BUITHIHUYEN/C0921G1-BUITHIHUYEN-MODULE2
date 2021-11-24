package bai_17_io_binary_file_serialization.bai_tap.quan_li_san_pham.services;

import bai_17_io_binary_file_serialization.bai_tap.quan_li_san_pham.models.Bycle;
import netscape.security.UserTarget;

import java.util.ArrayList;
import java.util.Scanner;
public class BycleServiceImpl implements BycleService {
    static ArrayList<Bycle> bycles = new ArrayList<>();

    static {
        bycles.add(new Bycle("A001", "Dream", "HonDa", 250000000, "năm 2021"));
        bycles.add(new Bycle("A002", "SH", "HonDa", 720000000, "năm 2021"));
        bycles.add(new Bycle("A003", "Vespa", "HonDa", 860000000, "năm 2021"));
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Bycle bycle = new Bycle();
        System.out.println("Mời bạn nhập mã sản phẩm ");
        bycle.setMaSanPham(scanner.nextLine());
        System.out.println("Mời bạn nhập tên sản phẩm");
        bycle.setTenSanPham(scanner.nextLine());
        System.out.println("Mời bạn nhập hãng sản xuất ");
        bycle.setHangSanXuat(scanner.nextLine());
        System.out.println("Mời bạn nhập giá sản phẩm");
        bycle.setGia(Double.parseDouble(scanner.nextLine()));
        System.out.println("Mời bạn nhập các mô tả khác");
        bycle.setCacMoTaKhac(scanner.nextLine());
        bycles.add(bycle);


    }

    @Override
    public void display() {
        for (Bycle bycle1 :bycles) {
            System.out.println(bycle1);

        }

    }

    @Override
    public void search(String maSanPham) {
        for(int i=0;i<bycles.size();i++){
            if(bycles.get(i).getMaSanPham().equals(maSanPham)){
                System.out.println(bycles.get(i));
            }
        }
    }

    @Override
    public void exit() {

    }
}