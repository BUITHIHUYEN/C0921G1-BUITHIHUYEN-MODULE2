package case_study.services.impl;

import case_study.models.Customer;
import case_study.services.CustomerService;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {
    static List<Customer> customers = new LinkedList<>();
    static {
        Customer customer1 = new Customer("E123", "Phan Thị Lan", "20/04/2000", "Nữ", 231546896, "0956487546", "lanphan@gmail.com", "Gold", "Liên Chiểu - Đà Nẵng");
        Customer customer2 = new Customer("E234", "Trần Văn Chánh", "15/01/1996", "Nam", 214564788, "0954678158", "chanhtran@gmail.com", "Silver", "Cẩm Lệ - Đà Nẵng");
        Customer customer3 = new Customer("E456", "Phạm Thị Huệ", "18/04/21994", "Nữ", 234568946, "0954678942", "huepham@gmail.com", "Platinnium", "Liên Chiểu - Đà Nẵng");
        Customer customer4 = new Customer("E789", "Nguyễn Văn Ấn", "11/01/1992", "Nam", 213264752, "09544567828", "annguyen@gmail.com", "Diamond", "Cẩm Lệ - Đà Nẵng");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    @Override
    public void add() {
        Customer customer = new Customer();
        System.out.println("Mời nhập mã ID");
        customer.setMaID(sc.nextLine());
        System.out.println("Nhập họ và tên:");
        customer.setHoVaTen(sc.nextLine());
        System.out.println("Nhập ngày sinh");
        customer.setNgaySinh(sc.nextLine());
        System.out.println("Nhập giới tính:");
        customer.setGioiTinh(sc.nextLine());
        System.out.println("Nhập số chứng minh nhân dân");
        customer.setSoCMND(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập số điện thoại:");
        customer.setSoDienThoai(sc.nextLine());
        System.out.println("Nhập email");
        customer.setEmail(sc.nextLine());
        System.out.println("Nhập từ 1 đến 5 để chọn mục hiển thị:");
        System.out.println("1. Diamond");
        System.out.println("2. Platinium");
        System.out.println("3. Gold ");
        System.out.println("4. Silver");
        System.out.println("5. Member");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                customer.setLoaiKhach("Diamond");
                break;
            case 2:
                customer.setLoaiKhach("Platinium");
                break;
            case 3:
                customer.setLoaiKhach("Gold");
                break;
            case 4:
                customer.setLoaiKhach("Silver");
                break;
            case 5:
                customer.setLoaiKhach("Member");
                break;
        }
        System.out.println("Nhập địa chỉ");
        customer.setDiaChi(sc.nextLine());
        customers.add(customer);
    }
    @Override
    public void edit(String maID) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getMaID().equals(maID)) {
                System.out.println("Nhập Mã iD");
                customers.get(i).setMaID(sc.nextLine());
                System.out.println("Nhập họ và tên:");
                customers.get(i).setHoVaTen(sc.nextLine());
                System.out.println("Nhập ngày sinh");
                customers.get(i).setNgaySinh(sc.nextLine());
                System.out.println("Nhập giới tính:");
                customers.get(i).setGioiTinh(sc.nextLine());
                System.out.println("Nhập số chứng minh nhân dân");
                customers.get(i).setSoCMND(Integer.parseInt(sc.nextLine()));
                System.out.println("Nhập số điện thoại:");
                customers.get(i).setSoDienThoai(sc.nextLine());
                System.out.println("Nhập email");
                customers.get(i).setEmail(sc.nextLine());
                System.out.println("Nhập loại khách:");
                customers.get(i).setLoaiKhach(sc.nextLine());
                System.out.println("Nhập địa chỉ");
                customers.get(i).setDiaChi(sc.nextLine());
            }
        }
    }
}
