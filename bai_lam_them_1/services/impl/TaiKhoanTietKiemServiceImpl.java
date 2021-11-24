package bai_lam_them_1.services.impl;

import bai_lam_them_1.models.TaiKhoanThanhToan;
import bai_lam_them_1.models.TaiKhoanTietKiem;
import bai_lam_them_1.services.TaiKhoanTietKiemService;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class TaiKhoanTietKiemServiceImpl implements TaiKhoanTietKiemService {
Validate validate = new Validate();
    static ArrayList<TaiKhoanTietKiem> taiKhoanTietKiems= new ArrayList<>();
static {
    taiKhoanTietKiems.add(new TaiKhoanTietKiem("003456781","Nguyen Van An","04/05/2020",15000000,"05/05/2020",5,6));
    taiKhoanTietKiems.add(new TaiKhoanTietKiem("003456788","Do Thu Hoai","02/04/2020",7000000,"27/05/2020",5,10));
    taiKhoanTietKiems.add(new TaiKhoanTietKiem("003456790","Nguyen Thi Canh","05/05/2020",7000000,"15/05/2020",9,12));
    Scanner scanner = new Scanner(System.in);
}
    @Override
    public void add() {
    TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem();
    taiKhoanTietKiem.setMaTaiKhoan();


    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        int iD = 0;
        for (int i= 0; i<taiKhoanTietKiems.size();i++){
            System.out.println(iD++);
            System.out.println(taiKhoanTietKiems);
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void exit() {

    }
}
