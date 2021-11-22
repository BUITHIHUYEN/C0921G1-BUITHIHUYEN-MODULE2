package bai_tap_cuoi_tuan_4.controllers;

import bai_tap_cuoi_tuan_4.services.impl.ExperienceServiceImpl;

import java.util.Scanner;

public class Menu {
    ExperienceServiceImpl experienceService = new  ExperienceServiceImpl();
    public void displayMenu() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Nhập từ 1 đến 4 để chọn mục hiển thị:");
            System.out.println("1. Experience ");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1 = 0;
                    while (choice1 != 6) {
                        System.out.println("Nhập từ 1 đến 5 để chọn chức năng: ");
                        System.out.println("1. add experience");
                        System.out.println("2. display experience");
                        System.out.println("3. search experience");
                        System.out.println("4. edit experience");
                        System.out.println("5. delete experience");
                        System.out.println("6. return menu");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("========================================");
                                System.out.println("add experience");
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                experienceService.display();
                                System.out.println("=============================================");
                                break;
                            case 3:
                                System.out.println("===================================================");
                                System.out.println("search experience");
                                System.out.println("================================================");
                                break;
                            case 4:
                                System.out.println("===============================================");
                                System.out.println("edit experience");
                                System.out.println("==================================================");
                                break;
                            case 5:
                                System.out.println("=================================================");
                                System.out.println("delete experience");
                                System.out.println("=====================================================");
                            case 6:

                                break;
                        }

                    }
                    break;

                case 2:
                    int choice2 = 0;
                    while (choice2 != 6) {
                        System.out.println("Nhập từ 1 đến 5 để chọn chức năng : ");
                        System.out.println("1. add fresher");
                        System.out.println("2. display fresher");
                        System.out.println("3. search fresher");
                        System.out.println("4. edit fresher");
                        System.out.println("5. delete fresher");
                        System.out.println("6. return menu ");
                       choice2 = scanner.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("========================================");
                                System.out.println("add fresher");
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                System.out.println(" display fresher");
                                System.out.println("=============================================");
                                break;
                            case 3:
                                System.out.println("===================================================");
                                System.out.println("search fresher");
                                System.out.println("================================================");
                                break;
                            case 4:
                                System.out.println("===============================================");
                                System.out.println("edit fresher");
                                System.out.println("==================================================");
                                break;
                            case 5:
                                System.out.println("=================================================");
                                System.out.println("delete experience");
                                System.out.println("=====================================================");
                            case 6:

                                break;
                        }

                    }
                    break;
                case 3:
                    int choice3 = 0;
                    while (choice3 != 6) {
                        System.out.println("Nhập từ 1 đến 5 để chọn chức năng : ");
                        System.out.println("1. add internship");
                        System.out.println("2. display internship");
                        System.out.println("3. search internship");
                        System.out.println("4. edit internship");
                        System.out.println("5. delete internship");
                        System.out.println("6. return menu ");
                        choice3 = scanner.nextInt();
                        switch (choice3) {
                            case 1:
                                System.out.println("========================================");
                                System.out.println("add internship");
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                System.out.println(" display internship");
                                System.out.println("=============================================");
                                break;
                            case 3:
                                System.out.println("===================================================");
                                System.out.println("search internship");
                                System.out.println("================================================");
                                break;
                            case 4:
                                System.out.println("===============================================");
                                System.out.println("edit internship");
                                System.out.println("==================================================");
                                break;
                            case 5:
                                System.out.println("=================================================");
                                System.out.println("delete internship");
                                System.out.println("=====================================================");
                            case 6:

                                break;
                        }

                    }
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}
