package thithulan2.controllers;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import javafx.scene.chart.ScatterChart;
import thithulan2.models.SinhVienIT;
import thithulan2.services.SinhVienITService;
import thithulan2.services.impl.SinhVienITServiceImpl;
import thithulan2.services.impl.SinhVienNgoaiNguServiceImpl;

import java.util.Scanner;

public class Menu {
    public void displaymenu() {
        SinhVienITServiceImpl sinhVienITServiceImpl = new SinhVienITServiceImpl();
        SinhVienNgoaiNguServiceImpl sinhVienNgoaiNguServiceImpl = new SinhVienNgoaiNguServiceImpl();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice != 7) {
            System.out.println("Nhập từ 1 đến 7 để chọn chức năng");
            System.out.println("1.add");
            System.out.println("2. display");
            System.out.println("3. delete");
            System.out.println("4. edit");
            System.out.println("5. search");
            System.out.println("6. sort");
            System.out.println("7.Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int choice1 = 0;
                    while (choice1 != 3) {
                        System.out.println("Mời nhập từ 1 đến 3 để chọn chức năng");
                        System.out.println("1. add sinh viên it");
                        System.out.println("2. add sinh viên ngoại ngữ");
                        System.out.println("3. return menu");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                System.out.println("========================================");
                                sinhVienITServiceImpl.add();
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                sinhVienNgoaiNguServiceImpl.add();
                                System.out.println("=============================================");
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 2:
                    int choice2 = 0;
                    while (choice2 != 3) {
                        System.out.println("Nhập từ 1 đến 3 để chọn chức năng: ");
                        System.out.println("1. display sinh viên it");
                        System.out.println("2. display sinh viên ngoại ngữ");
                        System.out.println("3. return menu");
                        choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2) {
                            case 1:
                                System.out.println("========================================");
                                sinhVienITServiceImpl.display();
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                sinhVienNgoaiNguServiceImpl.display();
                                System.out.println("=============================================");
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 3:
                    int choice3 = 0;
                    while (choice3 != 3) {
                        System.out.println("Nhập từ 1 đến 3 để chọn chức năng: ");
                        System.out.println("1. delete sinh viên it");
                        System.out.println("2. delete sinh viên ngoại ngữ");
                        System.out.println("3. return menu");
                        choice3 = Integer.parseInt(scanner.nextLine());
                        switch (choice3) {
                            case 1:
                                try {
                                    System.out.println("========================================");
                                    System.out.println("Nhập họ và tên cần xóa");
                                    System.out.println("1. Yes \n  2. No");
                                    int chon = scanner.nextInt();
                                    if (chon == 1) {
//                                Scanner scanner1 = new Scanner(System.in);
                                        String hoVaTen1 = scanner.nextLine();
                                        sinhVienITServiceImpl.delete(hoVaTen1);
                                    } else {
                                        break;
                                    }
                                } catch (Exception exception){
                                    System.out.println("Nhập lại đi");
                                }

                            case 2:
                                System.out.println("===========================================");
//                                Scanner scanner4 = new Scanner(System.in);
                                System.out.println("Nhập họ và tên cần tìm để xóa");
                                String hoVaTenNgoaiNgu = scanner.nextLine();
                                sinhVienNgoaiNguServiceImpl.delete(hoVaTenNgoaiNgu);
                                System.out.println("=============================================");
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 4:
                    int choice4 = 0;
                    while (choice4 != 3) {
                        System.out.println("Nhập từ 1 đến 3 để chọn chức năng: ");
                        System.out.println("1. edit sinh viên it");
                        System.out.println("2. edit sinh viên ngoại ngữ");
                        System.out.println("3. return menu");
                        choice4 = Integer.parseInt(scanner.nextLine());
                        switch (choice4) {
                            case 1:
                                System.out.println("========================================");
//                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("nhap họ và tên it");
                                String hoVaTenIt = scanner.nextLine();
                                sinhVienITServiceImpl.edit(hoVaTenIt);
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                System.out.println("nhập họ và tên ngoại ngữ");
                                String hoVaTenNN = scanner.nextLine();
                                sinhVienITServiceImpl.edit(hoVaTenNN);
                                System.out.println("=============================================");
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 5:
                    int choice5 = 0;
                    while (choice5 != 3) {
                        System.out.println("Nhập từ 1 đến 3 để chọn chức năng: ");
                        System.out.println("1. search sinh viên it");
                        System.out.println("2. search sinh viên ngoại ngữ");
                        System.out.println("3. return menu");
                        choice5 = Integer.parseInt(scanner.nextLine());
                        switch (choice5) {
                            case 1:
                                System.out.println("========================================");
//                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Nhập tên hoặc địa chỉ cần tìm kiếm ");
                                String search = scanner.nextLine();
                                sinhVienITServiceImpl.search(search);
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
//                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Nhập tên hoặc địa chỉ cần tìm kiếm ");
                                String search1 = scanner.nextLine();
                                sinhVienNgoaiNguServiceImpl.search(search1);
                                System.out.println("=============================================");
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 6:
                    int choice6 = 0;
                    while (choice6 != 3) {
                        System.out.println("Nhập từ 1 đến 3 để chọn chức năng: ");
                        System.out.println("1. sort sinh viên it");
                        System.out.println("2. sort sinh viên ngoại ngữ");
                        System.out.println("3. return menu");
                        choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2) {
                            case 1:
                                System.out.println("========================================");
                                System.out.println("1. sort sinh viên it");
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                System.out.println("2. sort sinh viên ngoại ngữ");
                                System.out.println("=============================================");
                                break;
                            case 3:
                                break;
                        }
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }
}
