package lop_va_doi_tuong_trong_java.bai_tap.bai_2_xay_dung_lop_stop_watch.;

public class Main2 {
    public static void main(String[] args) {

        XayDungLopStopWatch thoiGian = new XayDungLopStopWatch();

        System.out.println(  thoiGian.start());
        System.out.println( thoiGian.end());
        System.out.println(thoiGian.getElapsetTime());
    }
}

