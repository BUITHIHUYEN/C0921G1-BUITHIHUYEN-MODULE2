package bai_tap_cuoi_tuan_4.services.impl;

import bai_tap_cuoi_tuan_4.models.Fresher;
import bai_tap_cuoi_tuan_4.services.FresherService;

import java.util.ArrayList;
//        String email, String graduationTime, String graduationRank, String education

public class FresherServiceImpl implements FresherService {
    static ArrayList<Fresher> freshers = new ArrayList<>();
    static {
        freshers.add(new Fresher("B001","Nguyễn Thị","An","02-05-1993","Liên Chiểu- Đà Nẵng",985623452,"annguyen@gmail.com",
                "20-05-2015","Đại Học","Đông Du"));
        freshers.add(new Fresher("B002","Trần Thái","Học","12-06-1986","Cẩm Lệ- Đà Nẵng",958465234,"hoctran@gmail.com",
                "28-01-2010","Cao Học","Kinh Tế TPHCM"));
        freshers.add(new Fresher("B003","Nguyễn Thị Hương","Lan","28-10-1989","Liên Chiểu- Đà Nẵng",965148759,"lannguyen@gmail.com",
                "20-05-2009","Cao Đẳng","Hoa Sen"));
        freshers.add(new Fresher("B004","Bành Văn","Tân","18-05-1994","Cẩm Lệ- Đà Nẵng",926547965,"tanbanh@gmail.com",
                "20-11-2016","Đại Học","ĐH Mở TPHCM"));


}


    @Override
    public void add() {

    }

    @Override
    public void display() {
        for (Fresher fr:freshers) {
            System.out.println(fr);

        }

    }

    @Override
    public void edit() {

    }

    @Override
    public void search() {

    }
}
