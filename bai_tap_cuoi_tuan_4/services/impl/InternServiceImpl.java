package bai_tap_cuoi_tuan_4.services.impl;

import bai_tap_cuoi_tuan_4.models.Fresher;
import bai_tap_cuoi_tuan_4.models.Intern;
import bai_tap_cuoi_tuan_4.services.InternService;

import java.util.ArrayList;
import java.util.Scanner;

public class InternServiceImpl implements InternService {
    static ArrayList<Intern> interns = new ArrayList<>();

    //  String iD, String firstName, String lastName, String birthDate, String address, int phone,
//  String email, String majors, String semester, String universityName
    static {
        interns.add(new Intern("C001", "Nguyễn Ánh", "Tuyết", "21-03-2001", "Liên Chiểu - Đà Nẵng", "985263549",
                "tuyetnguyen@gmail.com", "kinh tế", "năm 1", "kinh tế quốc dân"));
        interns.add(new Intern("C002", "Trần Văn ", "Tú", "28-06-1999", "Liên Chiểu - Đà Nẵng", "985263549",
                "tutran@gmail.com", "kinh tế", "năm 2", "kinh tế quốc dân"));
        interns.add(new Intern("C003", "Bùi Ánh", "Trinh", "11-03-1998", "Liên Chiểu - Đà Nẵng", "985263549",
                "trinhbui@gmail.com", "kinh tế", "năm 3", "kinh tế quốc dân"));
        interns.add(new Intern("C004", "Thái Văn", "Thái", "21-03-1997", "Liên Chiểu - Đà Nẵng", "985263549",
                "thaithai@gmail.com", "kinh tế", "năm 4", "kinh tế quốc dân"));

    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {

        Intern it = new Intern();
        System.out.println("Mời bạn nhập id:");
        it.setiD(sc.nextLine());
        System.out.println("Mời bạn nhập firstname:");
        it.setFirstName(sc.nextLine());
        System.out.println("Mời bạn nhập lastname:");
        it.setLastName(sc.nextLine());
        System.out.println("Mời bạn nhập birthdate:");
        it.setBirthDate(sc.nextLine());
        System.out.println("Mời bạn nhập address: ");
        it.setAddress(sc.nextLine());
        System.out.println("Mời bạn nhập phone: ");
        it.setPhone(sc.nextLine());
        System.out.println("Mời bạn nhập email: ");
        it.setEmail(sc.nextLine());
        System.out.println("Mời bạn nhập majors:");
        it.setMajors(sc.nextLine());
        System.out.println("Mời bạn nhập semester:");
        it.setSemester(sc.nextLine());
        System.out.println("Mời bạn nhập univesity name:");
        it.setUniversityName(sc.nextLine());
        interns.add(it);


    }

    @Override
    public void display() {
        for (Intern it : interns) {
            System.out.println(it);

        }
    }

    @Override
    public void edit(String firstName) {
        for (int i = 0; i < interns.size(); i++) {
            if (interns.get(i).getFirstName().equals(firstName)) {
                System.out.println("Thay đổi id:");
                interns.get(i).setiD(sc.nextLine());
                System.out.println("Thay đổi firstName:");
                interns.get(i).setFirstName(sc.nextLine());
                System.out.println("Thay đổi lastName:");
                interns.get(i).setLastName(sc.nextLine());
                System.out.println("Mời bạn nhập birthdate:");
                interns.get(i).setBirthDate(sc.nextLine());
                System.out.println("Mời bạn nhập address: ");
                interns.get(i).setAddress(sc.nextLine());
                System.out.println("Mời bạn nhập phone: ");
                interns.get(i).setPhone(sc.nextLine());
                System.out.println("Mời bạn nhập email: ");
                interns.get(i).setEmail(sc.nextLine());
                System.out.println("Mời bạn nhập majors:");
                interns.get(i).setMajors(sc.nextLine());
                System.out.println("Mời bạn nhập semester:");
                interns.get(i).setSemester(sc.nextLine());
                System.out.println("Mời bạn nhập univesity name:");
                interns.get(i).setUniversityName(sc.nextLine());
            }

        }


    }

    @Override
    public void search(String lastName) {
        for (int i = 0; i < interns.size(); i++) {
            if (interns.get(i).getLastName().equals(lastName)) {
                System.out.println(interns.get(i));
            }


        }

    }

    @Override
    public void delete(String email) {
        for (int i = 0; i < interns.size(); i++) {
            if (interns.get(i).getEmail().equals(email)) {
                interns.remove(interns.get(i));
            }

        }
    }
}
