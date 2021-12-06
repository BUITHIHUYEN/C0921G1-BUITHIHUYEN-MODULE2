package thi_cuoi_module.services.impl;


import case_study.readwrite.FileWriterReader;
import thi_cuoi_module.common.writeread.ReadWrite;
import thi_cuoi_module.models.TaiKhoanTietKiem;
import thi_cuoi_module.services.TaiKhoanTietKiemService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemImpl implements TaiKhoanTietKiemService {
    final String PATH ="D:\\CODEGYMMODULE2\\C0921G1-BUITHIHUYEN-MODULE2\\src\\thi_cuoi_module\\common\\data\\taikhoantietkiem.csv";
    static List<TaiKhoanTietKiem> taiKhoanTietKiems = new ArrayList<>();

     {
        taiKhoanTietKiems = covertStringToTaiKhoanTietKiem();
//        taiKhoanTietKiems.add(new TaiKhoanTietKiem("003456781", "Nguyen Van An", "04/05/2020", 15000000, "05/05/2020", 5.4, "tháng"));
//        taiKhoanTietKiems.add(new TaiKhoanTietKiem("003456788", "Do Thu Hoai", "02/04/2020", 7000000, "27/05/2020", 5.1, "năm"));
//        taiKhoanTietKiems.add(new TaiKhoanTietKiem("003456790", "Nguyen Thi Canh", "05/05/2020", 7000000, "15/05/2020", 3.7, "quý"));
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem();
        System.out.println("Nhap ma tai khoan");
        taiKhoanTietKiem.setMaTaiKhoan(scanner.nextLine());
        System.out.println("Nhap tên chủ tài khoản");
        taiKhoanTietKiem.setTenChuTaiKhoan(scanner.nextLine());
        System.out.println("Nhap NGÀY tạo tài khoản");
        taiKhoanTietKiem.setNgayTaoTaiKhoan(scanner.nextLine());
        System.out.println("Nhap số tiền gửi ");
        taiKhoanTietKiem.setSoTienGuiTietKiem(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap NGÀY gửi tiết kiệm");
        taiKhoanTietKiem.setNgayGuiTietKiem(scanner.nextLine());
        System.out.println("Nhap lãi suất");
        taiKhoanTietKiem.setLaiSuat(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhap kì hạn");
        taiKhoanTietKiem.setKiHan(scanner.nextLine());
        taiKhoanTietKiems.add(taiKhoanTietKiem);
        display();
        List<String> stringList = covertTaiKhoanTietKiemToString();
        ReadWrite.writeFile(PATH, stringList, false);
    }

    @Override
    public void display() {
        int maID = 1;
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiems) {
            System.out.print(maID++ + "--");
            System.out.println(taiKhoanTietKiem);
        }
    }

    @Override
    public void delete(String maTaiKhoan) {
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if (taiKhoanTietKiems.get(i).getMaTaiKhoan().equals(maTaiKhoan)) {
                taiKhoanTietKiems.remove(taiKhoanTietKiems.get(i));
            }
        }

    }


    @Override
    public void search(String maTaiKhoan) {
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if (taiKhoanTietKiems.get(i).getMaTaiKhoan().equals(maTaiKhoan)) {
                System.out.println(taiKhoanTietKiems.get(i));
            }

        }
    }
    public List<TaiKhoanTietKiem> covertStringToTaiKhoanTietKiem() {
        List<String> stringList = FileWriterReader.readFile(PATH);
        List<TaiKhoanTietKiem> taiKhoanTietKiemList= new ArrayList<>();
        String[] arrTaiKhoanTietKiem;
        for (String line : stringList) {
            arrTaiKhoanTietKiem= line.split(",");
            taiKhoanTietKiemList.add(new TaiKhoanTietKiem(arrTaiKhoanTietKiem[0], arrTaiKhoanTietKiem[1], arrTaiKhoanTietKiem[2],
                    Integer.parseInt(arrTaiKhoanTietKiem[3]), arrTaiKhoanTietKiem[4],Double.parseDouble(arrTaiKhoanTietKiem[5]),arrTaiKhoanTietKiem[6]));
        }
        return taiKhoanTietKiemList;
    }


    public List<String> covertTaiKhoanTietKiemToString() {
        List<String> listString = new ArrayList<>();
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiems) {
            listString.add(taiKhoanTietKiem.toString());
        }
        return listString;
    }
}
