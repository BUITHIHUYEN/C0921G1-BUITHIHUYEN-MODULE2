package case_study.services.impl;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.FacilityService;
import case_study.utils.validate.Validate;
import java.util.*;
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
        for (Map.Entry<Facility, Integer> mapentry :facilitys.entrySet()) {
            System.out.println(mapentry.getKey());
        }
    }
    
    @Override
    public void add() {
    }
    Validate validate = new Validate();
    @Override
    public void addVilla() {

        Villa villa = new Villa();
        System.out.println("Nhập tên dịch vụ");
        villa.setTenDichVu(validate.tenDichVu());
        System.out.println("Nhập diện tích sử dụng");
        villa.setDienTichSuDung(validate.dienTichSuDung());
        System.out.println("Nhập chi phí thuế");
        villa.setChiPhiThue(validate.chiPhiThue());
        System.out.println("Nhập số lượng người tối đa");
        villa.setSoLuongNguoiToiDa(validate.soLuongNguoiToiDa());
        System.out.println("Nhập kiểu thuê");
        villa.setKieuthue(validate.kieuThue());
        System.out.println("Nhập tiêu chuẩn phòng");
        villa.setTieuChuanPhong(validate.tieuChuanPhong());
        System.out.println("Diện tích hồ bơi");
        villa.setDienTichHoBoi(validate.dienTichHoBoi());
        System.out.println("Nhập số tầng");
        villa.setSoTang(validate.soTang());
        facilitys.put(villa,1);
    }
    @Override
    public void addRoom() {
        Room room = new Room();
        System.out.println("Nhập tên dịch vụ");
        room.setTenDichVu(validate.tenDichVu());
        System.out.println("Nhập diện tích sử dụng");
        room.setDienTichSuDung(validate.dienTichSuDung());
        System.out.println("Nhập chi phí thuế");
        room.setChiPhiThue(validate.chiPhiThue());
        System.out.println("Nhập số lượng người tối đa");
        room.setSoLuongNguoiToiDa(validate.soLuongNguoiToiDa());
        System.out.println("Nhập kiểu thuê");
        room.setKieuthue(validate.kieuThue());
        System.out.println("Nhập dịch vụ miễn phí đi kèm");
        room.setDichVuMienPhiDiKem(validate.dichVuDiKem());
        facilitys.put(room,1);
    }
    @Override
    public void addHouse() {
        House house = new House();
        System.out.println("Nhập tên dịch vụ");
        house.setTenDichVu(validate.tenDichVu());
        System.out.println("Nhập diện tích sử dụng");
        house.setDienTichSuDung(validate.dienTichSuDung());
        System.out.println("Nhập chi phí thuế");
        house.setChiPhiThue(validate.chiPhiThue());
        System.out.println("Nhập số lượng người tối đa");
        house.setSoLuongNguoiToiDa(validate.soLuongNguoiToiDa());
        System.out.println("Nhập kiểu thuê");
        house.setKieuthue(validate.kieuThue());
        System.out.println("Nhập tiêu chuẩn phòng");
        house.setTieuChuanPhong(validate.tieuChuanPhong());
        System.out.println("Nhập số tầng");
        house.setSoTang(validate.soTang());
        facilitys.put(house,1);
    }
    @Override
    public void edit(String maID) {
    }
}
