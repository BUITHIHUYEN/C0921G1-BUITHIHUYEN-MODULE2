package case_study.controllers;

import case_study.models.Employee;
import case_study.services.EmployeeService;
import case_study.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        while (choice != 6) {
            System.out.println("Nhập từ 1 đến 6 để chọn chức năng");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1 = 0;
                    while (choice1 != 4) {
                        System.out.println("Mời nhập từ 1 đến 4 để chọn chức năng");
                        System.out.println("1. Display list employee");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("=============================================");
                                employeeServiceImpl.display();
                                System.out.println("==============================================");
                                break;
                            case 2:
                                System.out.println("=============================================");
                                employeeServiceImpl.add();
                                System.out.println("==============================================");
                                break;
                            case 3:
                                System.out.println("=============================================");
                                Scanner sc1 = new Scanner(System.in);
                                System.out.println("Mời nhập mã id cần edit:");
                                String emp = sc1.nextLine();
                                employeeServiceImpl.edit(emp);
                                System.out.println("==============================================");
                                break;
                            case 4:
                                System.out.println("=============================================");
                                System.out.println("4. Return main menu");
                                System.out.println("==============================================");
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    int choice2 = 0;
                    while (choice2 != 4) {
                        System.out.println("1. Display list customers");
                        System.out.println("2. Add new customers");
                        System.out.println("3. Edit customers");
                        System.out.println("4. Return main menu");
                        choice2 = scanner.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("=============================================");
                                System.out.println("1. Display list customers");
                                System.out.println("==============================================");
                                break;
                            case 2:
                                System.out.println("=============================================");
                                System.out.println("2. Add new customers");
                                System.out.println("==============================================");
                                break;
                            case 3:
                                System.out.println("=============================================");
                                System.out.println("3. Edit customers");
                                System.out.println("==============================================");
                                break;
                            case 4:
                                System.out.println("=============================================");
                                System.out.println("4. Return main menu");
                                System.out.println("==============================================");
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    int choice3 = 0;
                    while (choice3 != 4) {
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        choice3 = scanner.nextInt();
                        switch (choice3) {
                            case 1:
                                System.out.println("=============================================");
                                System.out.println("1. Display list facility");
                                System.out.println("==============================================");
                                break;
                            case 2:
                                System.out.println("=============================================");
                                System.out.println("2. Add new facility");
                                System.out.println("==============================================");
                                break;
                            case 3:
                                System.out.println("=============================================");
                                System.out.println("3. Add new facility maintenance");
                                System.out.println("==============================================");
                                break;
                            case 4:
                                System.out.println("=============================================");
                                System.out.println("4. Return main menu");
                                System.out.println("==============================================");
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 4:
                    int choice4 = 0;
                    while (choice4 != 6) {
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new contracts ");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        choice4 = scanner.nextInt();
                        switch (choice4) {
                            case 1:
                                System.out.println("=============================================");
                                System.out.println("1. Add new booking");
                                System.out.println("==============================================");
                                break;
                            case 2:
                                System.out.println("=============================================");
                                System.out.println("2. Display list booking");
                                System.out.println("==============================================");
                                break;
                            case 3:
                                System.out.println("=============================================");
                                System.out.println("3. Create new contracts");
                                System.out.println("==============================================");
                                break;
                            case 4:
                                System.out.println("=============================================");
                                System.out.println("4.Display list contracts");
                                System.out.println("==============================================");
                                break;
                            case 5:
                                System.out.println("=============================================");
                                System.out.println("5. Edit contracts");
                                System.out.println("==============================================");
                                break;
                            case 6:
                                System.out.println("=============================================");
                                System.out.println("6. Return main menu");
                                System.out.println("==============================================");
                                break;
                            default:
                                break;
                        }
                        break;
                    }
                case 5:
                    int choice5 = 0;
                    while (choice5 != 3) {
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher ");
                        System.out.println("3. Return main menu");
                        choice5 = scanner.nextInt();
                        switch (choice5) {
                            case 1:
                                System.out.println("=============================================");
                                System.out.println("1.Display list customers use service ");
                                System.out.println("==============================================");
                                break;
                            case 2:
                                System.out.println("=============================================");
                                System.out.println("2. Display list customers get voucher");
                                System.out.println("==============================================");
                                break;
                            case 3:
                                System.out.println("=============================================");
                                System.out.println("3. Return main menu");
                                System.out.println("==============================================");
                                break;
                            default:
                                break;
                        }
                        break;
                    }
                case 6:
                    System.out.println("=============================================");
                    System.out.println("Exit");
                    System.out.println("==============================================");
                    break;
                default:
                    break;
            }
            break;
        }
    }
}
