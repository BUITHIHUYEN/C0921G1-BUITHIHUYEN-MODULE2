package bai_tap_anh_chanh_giao.models;

import java.util.ArrayList;
import java.util.Scanner;

public class HangSanXuat {
    private String maHangSanXuat;
    private String tenHangSanXuat;
    private String tenQuocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String maHangSanXuat, String tenHangSanXuat, String tenQuocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(String maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
    static ArrayList<HangSanXuat> hangSanXuats = new ArrayList<>();
    static {
        hangSanXuats.add (new HangSanXuat("HSX-001","Yamaha","Nhật Bản"));
        hangSanXuats.add ( new HangSanXuat("HSX-002","Dongfeng","Trung Quốc"));
        hangSanXuats.add( new HangSanXuat("HSX-003","Huyndai","Hàn Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-004","Ford","Mỹ"));
        hangSanXuats.add(new HangSanXuat("HSX-005","Toyota","Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-006","Hino","Nhật Bản"));
    }
}
