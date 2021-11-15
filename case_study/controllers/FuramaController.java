package case_study.controllers;

import case_study.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        while(choice!=6) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Nhập từ 1 đến 6 để chọn chức năng");
            choice =  scanner.nextInt();
            switch (choice) {
                case 1:
                    while (choice != 4) {
                        System.out.println("1. Display list employee");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        choice = scanner.nextInt();
                    }
                    break;
                case 2:
                    while (choice != 4) {
                        System.out.println("1. Display list customers");
                        System.out.println("2. Add new customers");
                        System.out.println("3. Edit customers");
                        System.out.println("4. Return main menu");
                        choice = scanner.nextInt();

                    }
                    break;
                case 3:
                    while (choice != 4) {
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        choice = scanner.nextInt();

                    }
                    break;
                case 4:
                    while (choice != 5) {
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new contracts ");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        choice = scanner.nextInt();
                    }
                    break;
                case 5:
                    while (choice != 3) {
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher ");
                        System.out.println("3. Return main menu");
                        choice = scanner.nextInt();
                    }
                    break;
                default:


            }
        }


    }
    }
