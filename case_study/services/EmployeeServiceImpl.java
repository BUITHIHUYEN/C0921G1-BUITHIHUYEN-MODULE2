package case_study.services;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    static ArrayList <Employee> employees = new ArrayList<>();
    static {
        Employee employee1 = new Employee("A123","Bùi Thị Huyền","20/03/1993","Nữ",230936187,986764217,
                "huyenbui123@gmail.com","Đại Học","Quản Lý",2000);
        Employee employee2 = new Employee("B123","Lê Thị Hạnh","08/08/1974","Nữ",214367890,353778907,"hanhle234@gmail.com",
                "Cao Đẳng","nhân viên",1000);
        Employee employee3 = new Employee("C123","Phan Xuân Lưu","03/12/1994","Nam",123456789,986756789,
                "luuphan123@gmail.com","sau Đại Học","Giám Đốc",2500);
        Employee employee4 = new Employee("D123","Trần Thị Lam","21/05/1987","Nữ",23456789,987645678,"lamtran123@gmail.com",
                "Trung Cấp","Lễ Tân",500);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
    }

    public EmployeeServiceImpl() {
    }

    public EmployeeServiceImpl(String maID, String hoVaTen, String ngaySinh, String gioiTinh, int soCMND,
                               int soDienThoai, String email, String trinhDo, String viTri, double luong) {
        super(maID, hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, trinhDo, viTri, luong);
    }
    

    @Override
    public void display() {
        for (Employee employee:employees) {
            System.out.println(employee);
        }

    }

    @Override
    public void add() {
        Employee newEmployee = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Mã Nhân Viên");

    }

    @Override
    public void edit() {

    }
}
