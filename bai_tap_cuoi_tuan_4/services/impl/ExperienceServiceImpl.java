package bai_tap_cuoi_tuan_4.services.impl;

import bai_tap_cuoi_tuan_4.models.Experience;
import bai_tap_cuoi_tuan_4.services.ExperienceService;

import java.util.ArrayList;

public class ExperienceServiceImpl implements ExperienceService {
    static ArrayList<Experience> experiences = new ArrayList<>();
    static {
        experiences.add(new Experience("A001","Lê Thị","Hạnh","08-08-1974"," Liên Chiểu- Đà Nẵng",987654323,
                "hanhle@gmail.com","manager",3.5,"marketing"));
        experiences.add(new Experience("A002","Lê Thị Thu","Hà","11-11-1990","Cẩm Lệ - Đà Nẵng ",962456254,
                "thule@gmail.com","manager",5,"marketing"));
        experiences.add(new Experience("A003","Trần Văn","Tân","18-08-1989","Liên Chiểu- Đà Nẵng",965248945,
                "tantran@gmail.com","manager",1.5,"marketing"));
        experiences.add(new Experience("A004","Phan Xuân ","Lưu","04-12-1994","Cẩm Lệ-Đà Nẵng",963546987,
                "luuphan@gmail.com","manager",6,"marketing"));
    }
    @Override
    public void add() {

    }

    @Override
    public void display() {
        for (Experience ex:experiences) {
            System.out.println(ex);
        }

    }

    @Override
    public void edit() {

    }

    @Override
    public void search() {

    }
}
