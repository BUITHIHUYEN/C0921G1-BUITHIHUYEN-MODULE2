package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    static ArrayList <Employee> employees = new ArrayList<>();
    static {
        Employee employee1 = new Employee("A123","Bùi Thị Huyền","20/03/1993","Nữ",230936187,"986764217",
                "huyenbui123@gmail.com","Đại Học","Quản Lý",2000);
        Employee employee2 = new Employee("B123","Lê Thị Hạnh","08/08/1974","Nữ",214367890,"353778907","hanhle234@gmail.com",
                "Cao Đẳng","nhân viên",1000);
        Employee employee3 = new Employee("C123","Phan Xuân Lưu","03/12/1994","Nam",123456789,"986756789",
                "luuphan123@gmail.com","sau Đại Học","Giám Đốc",2500);
        Employee employee4 = new Employee("D123","Trần Thị Lam","21/05/1987","Nữ",23456789,"987645678","lamtran123@gmail.com",
                "Trung Cấp","Lễ Tân",500);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void display(){

        for (Employee employee:employees) {
            System.out.println(employee);
        }

    }
//    String maID, String hoVaTen, String ngaySinh, String gioiTinh, int soCMND, int soDienThoai,
//    String email, String trinhDo, String viTri, double luong
    @Override
    public void add() {
        Employee employee = new Employee();
        System.out.println("Nhập Mã iD");
        employee.setMaID(sc.nextLine());
        System.out.println("Nhập họ và tên:");
        employee.setHoVaTen(sc.nextLine());
        System.out.println("Nhập ngày sinh");
        employee.setNgaySinh(sc.nextLine());
        System.out.println("Nhập giới tính:");
        employee.setGioiTinh(sc.nextLine());
        System.out.println("Nhập số chứng minh nhân dân");
        employee.setSoCMND(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập số điện thoại:");
        employee.setSoDienThoai(sc.nextLine());
        System.out.println("Nhập email");
        employee.setEmail(sc.nextLine());
        System.out.println("Nhập trình độ:");
        employee.setTrinhDo(sc.nextLine());
        System.out.println("Nhập vị trí");
        employee.setViTri(sc.nextLine());
        System.out.println("Nhập lương:");
        employee.setLuong(Double.parseDouble(sc.nextLine()));
        employees.add(employee);
    }

    @Override
    public void edit(String maID) {
        for (int i = 0;i<employees.size();i++){
            if(employees.get(i).getMaID().equals(maID));
            System.out.println("Nhập Mã iD");
            employees.get(i).setMaID(sc.nextLine());
            System.out.println("Nhập họ và tên:");
            employees.get(i).setHoVaTen(sc.nextLine());
            System.out.println("Nhập ngày sinh");
            employees.get(i).setNgaySinh(sc.nextLine());
            System.out.println("Nhập giới tính:");
            employees.get(i).setGioiTinh(sc.nextLine());
            System.out.println("Nhập số chứng minh nhân dân");
            employees.get(i).setSoCMND(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập số điện thoại:");
            employees.get(i).setSoDienThoai(sc.nextLine());
            System.out.println("Nhập email");
            employees.get(i).setEmail(sc.nextLine());
            System.out.println("Nhập trình độ:");
            employees.get(i).setTrinhDo(sc.nextLine());
            System.out.println("Nhập vị trí");
            employees.get(i).setViTri(sc.nextLine());
            System.out.println("Nhập lương:");
            employees.get(i).setLuong(Double.parseDouble(sc.nextLine()));

        }


    }
}
