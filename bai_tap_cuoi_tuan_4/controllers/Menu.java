package bai_tap_cuoi_tuan_4.controllers;

import bai_tap_cuoi_tuan_4.services.InternService;
import bai_tap_cuoi_tuan_4.services.impl.ExperienceServiceImpl;
import bai_tap_cuoi_tuan_4.services.impl.FresherServiceImpl;
import bai_tap_cuoi_tuan_4.services.impl.InternServiceImpl;

import java.util.Scanner;

public class Menu {
    ExperienceServiceImpl experienceService = new  ExperienceServiceImpl();
    FresherServiceImpl fresherService = new FresherServiceImpl();
    InternServiceImpl internService = new InternServiceImpl();
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
                                experienceService.add();
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                experienceService.display();
                                System.out.println("=============================================");
                                break;
                            case 3:
                                System.out.println("===================================================");
                                Scanner sc1 = new Scanner(System.in);
                                String st1 = sc1.nextLine();
                                System.out.println("Mời nhập tên cần tìm kiếm:");
                                experienceService.search(st1);
                                System.out.println("================================================");
                                break;
                            case 4:
                                System.out.println("===============================================");
                                Scanner sc2 = new Scanner(System.in);
                                System.out.println("Mời nhập firstname cần edit:");
                                String st2 = sc2.nextLine();
                                experienceService.edit(st2);

                                System.out.println("==================================================");
                                break;
                            case 5:
                                System.out.println("=================================================");
                                Scanner sc3 = new Scanner(System.in);
                                System.out.println("Mời nhập email cần delete:");
                                String st3 = sc3.nextLine();
                                experienceService.edit(st3);
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
                               fresherService.add();
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                                fresherService.display();
                                System.out.println("=============================================");
                                break;
                            case 3:
                                System.out.println("===================================================");
                                Scanner sc3 = new Scanner(System.in);
                                String fr1 = sc3.nextLine();
                                System.out.println("Mời nhập tên cần tìm kiếm:");
                                experienceService.search(fr1);
                                System.out.println("================================================");
                                break;
                            case 4:
                                System.out.println("===============================================");
                                Scanner sc4 = new Scanner(System.in);
                                System.out.println("Mời nhập firstname cần edit:");
                                String fr2 = sc4.nextLine();
                                fresherService.edit(fr2);
                                System.out.println("==================================================");
                                break;
                            case 5:
                                System.out.println("=================================================");
                                Scanner sc5 = new Scanner(System.in);
                                System.out.println("Mời nhập email cần delete:");
                                String fr3 = sc5.nextLine();
                                fresherService.edit(fr3);
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
                               internService.add();
                                System.out.println("=========================================");
                                break;
                            case 2:
                                System.out.println("===========================================");
                               internService.display();
                                System.out.println("=============================================");
                                break;
                            case 3:
                                System.out.println("===================================================");
                                Scanner sc = new Scanner(System.in);
                                String it = sc.nextLine();
                                System.out.println("Mời nhập tên cần tìm kiếm:");
                                experienceService.search(it);
                                System.out.println("================================================");
                                break;
                            case 4:
                                System.out.println("===============================================");
                                Scanner sc1 = new Scanner(System.in);
                                System.out.println("Mời nhập firstname cần edit:");
                                String it1 = sc1.nextLine();

                                internService.edit(it1);
                                System.out.println("==================================================");
                                break;
                            case 5:
                                System.out.println("=================================================");
                                Scanner sc2 = new Scanner(System.in);
                                System.out.println("Mời nhập email cần delete:");
                                String it2 = sc2.nextLine();
                                fresherService.edit(it2);
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
