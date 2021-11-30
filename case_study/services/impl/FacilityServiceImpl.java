package case_study.services.impl;

import bai_21_design_patterns.thuc_hanh.factory_method.FactoryAnimal;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.FacilityService;
import com.sun.javafx.collections.MappingChange;
import com.sun.javafx.collections.SourceAdapterChange;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.INEG;

import javax.swing.plaf.basic.BasicListUI;
import java.util.*;

//String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa,
//        int kieuthue, String tieuChuanPhong, double dienTichHoBoi, int soTang) {


//String tenDichVu, double dienTichSuDung, double chiPhiThue,
//        int soLuongNguoiToiDa, int kieuthue, String dichVuMienPhiDiKem

//String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa,
//        int kieuthue, String tieuChuanPhong, int soTang)
public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> facilitys = new LinkedHashMap<>();

    static {
        facilitys.put(new Villa("Villa", 30.5, 65.1, 3, "Tháng", "Vip", 42.6, 12), 1);
        facilitys.put(new Room("Room", 45.2, 20.8, 6, "Quý", "Massage"), 2);
        facilitys.put(new House("House", 29.9, 18.9, 4, "Năm", "Vip", 12), 3);
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> mapentry : facilitys.entrySet()) {
            System.out.println(mapentry.getKey());
        }

    }
    @Override
    public void add() {
    }
    @Override
    public void addVilla() {
        Villa villa = new Villa();
        System.out.println("Nhập tên dịch vụ");
        villa.setTenDichVu(sc.nextLine());
        System.out.println("Nhập diện tích sử dụng");
        villa.setDienTichSuDung(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập chi pí thuế");
        villa.setChiPhiThue(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập số lượng người tối đa");
        villa.setSoLuongNguoiToiDa(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập kiểu thuế");
        villa.setKieuthue(sc.nextLine());
        System.out.println("Nhập tiêu chuẩn phòng");
        villa.setTieuChuanPhong(sc.nextLine());
        System.out.println("Diện tích hồ bơi");
        villa.setDienTichHoBoi(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập số tầng");
        villa.setSoTang(Integer.parseInt(sc.nextLine()));
        facilitys.put(villa,1);
    }
    @Override
    public void addRoom() {
        Room room = new Room();
        System.out.println("Nhập tên dịch vụ");
        room.setTenDichVu(sc.nextLine());
        System.out.println("Nhập diện tích sử dụng");
        room.setDienTichSuDung(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập chi phí thuế");
        room.setChiPhiThue(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập số lượng người tối đa");
        room.setSoLuongNguoiToiDa(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập kiểu thuê");
        room.setSoLuongNguoiToiDa(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập dịch vụ miễn phí đi kèm");
        room.setDichVuMienPhiDiKem(sc.nextLine());
        facilitys.put(room,1);
    }
    @Override
    public void addHouse() {
        House house = new House();
        System.out.println("Nhập tên dịch vụ");
        house.setTenDichVu(sc.nextLine());
        System.out.println("Nhập diện tích sử dụng");
        house.setDienTichSuDung(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập chi phí thuế");
        house.setChiPhiThue(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập số lượng người tối đa");
        house.setSoLuongNguoiToiDa(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập kiểu thuê");
        house.setKieuthue(sc.nextLine());
        System.out.println("Nhập tiêu chuẩn phòng");
        house.setTieuChuanPhong(sc.nextLine());
        System.out.println("Nhập số tầng");
        house.setSoTang(Integer.parseInt(sc.nextLine()));
        facilitys.put(house,1);
    }
    @Override
    public void edit(String maID) {


    }
}
