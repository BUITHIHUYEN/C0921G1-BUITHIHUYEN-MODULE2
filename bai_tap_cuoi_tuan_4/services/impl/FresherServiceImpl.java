package bai_tap_cuoi_tuan_4.services.impl;

import bai_tap_cuoi_tuan_4.models.Fresher;
import bai_tap_cuoi_tuan_4.services.FresherService;

import java.util.ArrayList;
import java.util.Scanner;
//        String email, String graduationTime, String graduationRank, String education

public class FresherServiceImpl implements FresherService {
    static ArrayList<Fresher> freshers = new ArrayList<>();

    static {
        freshers.add(new Fresher("B001", "Nguyễn Thị", "An", "02-05-1993", "Liên Chiểu- Đà Nẵng", 985623452, "annguyen@gmail.com",
                "20-05-2015", "Đại Học", "Đông Du"));
        freshers.add(new Fresher("B002", "Trần Thái", "Học", "12-06-1986", "Cẩm Lệ- Đà Nẵng", 958465234, "hoctran@gmail.com",
                "28-01-2010", "Cao Học", "Kinh Tế TPHCM"));
        freshers.add(new Fresher("B003", "Nguyễn Thị Hương", "Lan", "28-10-1989", "Liên Chiểu- Đà Nẵng", 965148759, "lannguyen@gmail.com",
                "20-05-2009", "Cao Đẳng", "Hoa Sen"));
        freshers.add(new Fresher("B004", "Bành Văn", "Tân", "18-05-1994", "Cẩm Lệ- Đà Nẵng", 926547965, "tanbanh@gmail.com",
                "20-11-2016", "Đại Học", "ĐH Mở TPHCM"));

    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {

        Fresher fr = new Fresher();
        System.out.println("Mời bạn nhập id:");
        fr.setiD(sc.nextLine());
        System.out.println("Mời bạn nhập firstname:");
        fr.setFirstName(sc.nextLine());
        System.out.println("Mời bạn nhập lastname:");
        fr.setLastName(sc.nextLine());
        System.out.println("Mời bạn nhập birthdate:");
        fr.setBirthDate(sc.nextLine());
        System.out.println("Mời bạn nhập address: ");
        fr.setAddress(sc.nextLine());
        System.out.println("Mời bạn nhập phone: ");
        fr.setPhone(sc.nextInt());
        System.out.println("Mời bạn nhập email: ");
        fr.setEmail(sc.nextLine());
        System.out.println("Mời bạn nhập graduation time:");
        fr.setGraduationTime(sc.nextLine());
        System.out.println("Mời bạn nhập graduation rank:");
        fr.setGraduationRank(sc.nextLine());
        System.out.println("Mời bạn nhập education:");
        fr.setEducation(sc.nextLine());
        freshers.add(fr);


    }

    @Override
    public void display() {
        for (Fresher fr : freshers) {
            System.out.println(fr);

        }

    }

    @Override
    public void edit(String firstName) {
        for (int i = 0; i < freshers.size(); i++) {
            if (freshers.get(i).getFirstName().equals(firstName)) {
                System.out.println("Thay đổi id:");
                freshers.get(i).setiD(sc.nextLine());
                System.out.println("Thay đổi firstName:");
                freshers.get(i).setFirstName(sc.nextLine());
                System.out.println("Thay đổi lastName:");
                freshers.get(i).setLastName(sc.nextLine());
                System.out.println("Mời bạn nhập birthdate:");
                freshers.get(i).setBirthDate(sc.nextLine());
                System.out.println("Mời bạn nhập address: ");
                freshers.get(i).setAddress(sc.nextLine());
                System.out.println("Mời bạn nhập phone: ");
                freshers.get(i).setPhone(sc.nextInt());
                System.out.println("Mời bạn nhập email: ");
                freshers.get(i).setEmail(sc.nextLine());
                System.out.println("Mời bạn nhập graduation rank:");
                freshers.get(i).setGraduationTime(sc.nextLine());
                System.out.println("Mời bạn nhập education:");
                freshers.get(i).setGraduationRank(sc.nextLine());
            }

        }


    }

    @Override
    public void search(String lastName) {
        for (int i = 0; i < freshers.size(); i++) {
            if (freshers.get(i).getLastName().equals(lastName)) {
                System.out.println(freshers.get(i));
            }


        }
    }

    @Override
    public void delete(String email) {
        for (int i = 0; i < freshers.size(); i++) {
            if (freshers.get(i).getEmail().equals(email)) {
                freshers.remove(freshers.get(i));
            }

        }
    }
}
