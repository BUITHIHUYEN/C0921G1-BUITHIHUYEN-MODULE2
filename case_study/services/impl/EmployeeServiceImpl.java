package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    static List<Employee> employees = new ArrayList<>();

    static {
        Employee employee1 = new Employee("A123", "Bùi Thị Huyền", "20/03/1993", "Nữ", 230936187, "986764217",
                "huyenbui123@gmail.com", "Đại Học", "Quản Lý", 2000);
        Employee employee2 = new Employee("B123", "Lê Thị Hạnh", "08/08/1974", "Nữ", 214367890, "353778907", "hanhle234@gmail.com",
                "Cao Đẳng", "nhân viên", 1000);
        Employee employee3 = new Employee("C123", "Phan Xuân Lưu", "03/12/1994", "Nam", 123456789, "986756789",
                "luuphan123@gmail.com", "sau Đại Học", "Giám Đốc", 2500);
        Employee employee4 = new Employee("D123", "Trần Thị Lam", "21/05/1987", "Nữ", 23456789, "987645678", "lamtran123@gmail.com",
                "Trung Cấp", "Lễ Tân", 500);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

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
        employee.setTrinhDo(trinhDo());
        employee.setViTri(viTri());

//            System.out.println("Nhập từ 1 đến 4 để chọn mục hiển thị:");
//            System.out.println("1. Trung cấp");
//            System.out.println("2. Cao Đẳng");
//            System.out.println("3. Đại Học");
//            System.out.println("4. Sau Đại Học");
//        int choice = Integer.parseInt(sc.nextLine());
//            switch (choice){
//                case 1:
//                    employee.setTrinhDo("Trung Cấp");
//                    break;
//                case 2:
//                    employee.setTrinhDo("Cao Đẳng");
//                    break;
//                case 3:
//                    employee.setTrinhDo("Đại Học");
//                    break;
//                case 4:
//                    employee.setTrinhDo("Sau Đại Học");
//                    break;
//            }
//        System.out.println("Nhập từ 1 đến 6 để chọn:");
//        System.out.println("1. Lễ Tân");
//        System.out.println("2. Phục vụ");
//        System.out.println("3. Chuyên viên");
//        System.out.println("4. Giám Sát");
//        System.out.println("5. Quản Lí");
//        System.out.println("6. Giám Đốc");
//        int choice1 = Integer.parseInt(sc.nextLine());
//        switch (choice1){
//            case 1:
//               employee.setViTri("Lễ Tân");
//                break;
//            case 2:
//                employee.setViTri("Phục Vụ");
//                break;
//            case 3:
//                employee.setViTri("Chuyên Viên");
//                break;
//            case 4:
//                employee.setViTri("Giám Sát");
//                break;
//            case 5:
//                employee.setViTri("Quản Lí");
//                break;
//            case 6:
//                employee.setViTri("Giám Đốc");
//                break;
//        }
        System.out.println("Nhập lương:");
        employee.setLuong(Double.parseDouble(sc.nextLine()));
        employees.add(employee);
    }

    @Override
    public void edit(String maID) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getMaID().equals(maID)) ;
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
            employees.get(i).setTrinhDo(trinhDo());
            employees.get(i).setViTri(viTri());
            System.out.println("Nhập lương:");
            employees.get(i).setLuong(Double.parseDouble(sc.nextLine()));

        }

    }

    public String trinhDo() {
        String trinhDo = "";
        System.out.println("Nhập từ 1 đến 4 để chọn mục hiển thị:");
        System.out.println("1. Trung cấp");
        System.out.println("2. Cao Đẳng");
        System.out.println("3. Đại Học");
        System.out.println("4. Sau Đại Học");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Trung Cấp");
                trinhDo = "Trung Cấp";
                break;
            case 2:
                System.out.println("Cao Đẳng");
                trinhDo = "Cao Đẳng";
                break;
            case 3:
                System.out.println("Đại Học");
                trinhDo = "Đại Học";
                break;
            case 4:
                System.out.println("Sau Đại Học");
                trinhDo = "Sau Đại Học";
                break;

        }
        return trinhDo;
    }

    public String viTri() {
        String viTri = "";
        System.out.println("Nhập từ 1 đến 6 để chọn:");
        System.out.println("1. Lễ Tân");
        System.out.println("2. Phục vụ");
        System.out.println("3. Chuyên viên");
        System.out.println("4. Giám Sát");
        System.out.println("5. Quản Lí");
        System.out.println("6. Giám Đốc");
        int choice1 = Integer.parseInt(sc.nextLine());
        switch (choice1) {
            case 1:
                System.out.println("Lễ Tân");
                viTri = "Lễ Tân";
                break;
            case 2:
                System.out.println("Phục Vụ");
                viTri = "Phục Vụ";
                break;
            case 3:
                System.out.println("Chuyên Viên");
                viTri = "Chuyên Viên";
                break;
            case 4:
                System.out.println("Giám Sát");
                viTri = "Giám Sát";
                break;
            case 5:
                System.out.println("Quản Lí");
                viTri = "Quản Lí";
                break;
            case 6:
                System.out.println("Giám Đốc");
                viTri = "Giám Đốc";
                break;
        }
        return viTri;

    }
}
