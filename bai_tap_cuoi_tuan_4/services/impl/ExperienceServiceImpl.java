package bai_tap_cuoi_tuan_4.services.impl;

import bai_tap_cuoi_tuan_4.models.Experience;
import bai_tap_cuoi_tuan_4.services.ExperienceService;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Scanner;

public class ExperienceServiceImpl implements ExperienceService {
    static ArrayList<Experience> experiences = new ArrayList<>();
    static {
        experiences.add(new Experience("A001","Lê Thị","Hạnh","08-08-1974"," Liên Chiểu- Đà Nẵng","987654323",
                "hanhle@gmail.com",3.5,"marketing"));
        experiences.add(new Experience("A002","Lê Thị Thu","Hà","11-11-1990","Cẩm Lệ - Đà Nẵng ","962456254",
                "thule@gmail.com",5,"marketing"));
        experiences.add(new Experience("A003","Trần Văn","Tân","18-08-1989","Liên Chiểu- Đà Nẵng","965248945",
                "tantran@gmail.com",1.5,"marketing"));
        experiences.add(new Experience("A004","Phan Xuân ","Lưu","04-12-1994","Cẩm Lệ-Đà Nẵng","963546987",
                "luuphan@gmail.com",6,"marketing"));
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void add() {

        Experience ex = new Experience();
        System.out.println("Mời bạn nhập id");
        ex.setiD(sc.nextLine());
        System.out.println("Mời bạn nhập firstname:");
        ex.setFirstName(sc.nextLine());
        System.out.println("Mời bạn nhập lastname:");
        ex.setLastName(sc.nextLine());
        System.out.println("Mời bạn nhập birthdate:");
        ex.setBirthDate(sc.nextLine());
        System.out.println("Mời bạn nhập address: ");
        ex.setAddress(sc.nextLine());
        System.out.println("Mời bạn nhập phone: ");
        ex.setPhone(sc.nextLine());
        System.out.println("Mời bạn nhập email: ");
        ex.setEmail(sc.nextLine());
        System.out.println("Mời bạn nhập expinyear:");
        ex.setExpInYear(sc.nextDouble());
        System.out.println("Mời bạn nhập proskill:");
        ex.setProSkill(sc.nextLine());
        experiences.add(ex);
    }

    @Override
    public void display() {
        for (Experience ex:experiences) {
            System.out.println(ex);
        }

    }

    @Override
    public void edit(String firstName) {
        for (int i = 0; i < experiences.size(); i++) {
            if (experiences.get(i).getFirstName().equals(firstName)) {
                System.out.println("Thay đổi id:");
                experiences.get(i).setiD(sc.nextLine());
                System.out.println("Thay đổi firstName:");
                experiences.get(i).setFirstName(sc.nextLine());
                System.out.println("Thay đổi lastName:");
                experiences.get(i).setLastName(sc.nextLine());
                System.out.println("Mời bạn nhập birthdate:");
                experiences.get(i).setBirthDate(sc.nextLine());
                System.out.println("Mời bạn nhập address: ");
                experiences.get(i).setAddress(sc.nextLine());
                System.out.println("Mời bạn nhập phone: ");
                experiences.get(i).setPhone(sc.nextLine());
                System.out.println("Mời bạn nhập email: ");
                experiences.get(i).setEmail(sc.nextLine());
                System.out.println("Mời bạn nhập expinyear:");
                experiences.get(i).setExpInYear(Double.parseDouble(sc.nextLine()));
                System.out.println("Mời bạn nhập proskill:");
                experiences.get(i).setProSkill(sc.nextLine());

            }


        }
    }
    @Override
    public void search(String lastName) {
        for (int i=0;i<experiences.size();i++){
            if(experiences.get(i).getLastName().equals(lastName)){
                System.out.println(experiences.get(i));
            }
        }
    }
    @Override
    public void delete(String email) {
        for(int i=0;i<experiences.size();i++){
            if (experiences.get(i).getEmail().equals(email)){
                experiences.remove(experiences.get(i));
            }
        }
    }
}
