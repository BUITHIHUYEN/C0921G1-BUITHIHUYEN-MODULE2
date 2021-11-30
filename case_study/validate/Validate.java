package case_study.validate;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Validate {
    Scanner scanner = new Scanner(System.in);

    public String tenDichVu() {
        String tenDichVu;
        while (true) {
            System.out.println("Nhập tên dịch vụ");
            tenDichVu = scanner.nextLine();
            Pattern pattern = Pattern.compile("");
            if (pattern.matcher(tenDichVu).find()) {
                break;
            } else {
                System.out.println("Nhập sai mời nhập lại, viết hoa kí tự đầu, kí tự sau viết thường");
            }
        }
        return tenDichVu;
    }

    public String maDVVilla() {
        String maDVVilla;
        while (true) {
            System.out.println("Mời nhập mã dịch vụ Villa");
            maDVVilla = scanner.nextLine();
            Pattern pattern = Pattern.compile("");
            if (pattern.matcher(maDVVilla).find()) {
                break;
            } else {
                System.out.println("Mã dịch vụ phải đúng định dạng: SVVL-YYYY, với YYYY là các số từ 0-9");
            }
        }
        return maDVVilla;
    }

    public String maDVRoom() {
        String maDVRoom;
        while (true) {
            System.out.println("Mời nhập mã dịch vụ room");
            maDVRoom = scanner.nextLine();
            Pattern pattern = Pattern.compile("");
            if (pattern.matcher(maDVRoom).find()) {
                break;
            } else {
                System.out.println("Mã dịch vụ phải đúng định dạng: SVRO-YYYY, với YYYY là các số từ 0-9");
            }
        }
        return maDVRoom;
    }

    public String maDVHouse() {
        String maDVHouse;

        while (true) {
            System.out.println("Mời nhập mã dịch vụ house");
            maDVHouse = scanner.nextLine();
            Pattern pattern = Pattern.compile("");
            if (pattern.matcher(maDVHouse).find()) {
                break;
            } else {
                System.out.println("Mã dịch vụ phải đúng định dạng: SVHO-YYYY, với YYYY là các số từ 0-9");
            }
        }
        return maDVHouse;
    }

    public Double dienTichSuDung() {
        while (true) {
            try {
                System.out.println("Mời nhập diện tích sử dụng");
                double dienTichSuDung = Double.parseDouble(scanner.nextLine());
                if (dienTichSuDung > 30) {
                    return dienTichSuDung;
                } else {
                    throw new Exception();
                }
            } catch (Exception exception) {
                System.out.println("Không được nhập diện tích nhỏ hơn 30");
            }
        }
    }

    public Double chiPhiThue() {
        while (true) {
            try {
                System.out.println("Mời nhập chi phí thuế");
                double chiPhiThue = Double.parseDouble(scanner.nextLine());
                if (chiPhiThue > 0) {
                    return chiPhiThue;
                } else {
                    throw new Exception();
                }
            } catch (Exception exception) {
                System.out.println("Không được nhập chi phí thuế là số âm");
            }
        }
    }

    public Integer soLuongNguoiToiDa() {
        while (true) {
            try {
                System.out.println("Mời nhập số lượng người tối đa");
                Integer soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
                if (soLuongNguoiToiDa > 0 && soLuongNguoiToiDa < 20) {
                    return soLuongNguoiToiDa;
                } else {
                    throw new Exception();
                }
            } catch (Exception exception) {
                System.out.println("Phải nhập số lượng người tố đa lớn hơn 0 và nhỏ hơn 20");
            }
        }
    }

    public String kieuThue() {
        String kieuThue;
        while (true) {
            System.out.println("Mời nhập kiểu thuê");
            kieuThue = scanner.nextLine();
            Pattern pattern = Pattern.compile("");
            if (pattern.matcher(kieuThue).find()) {
                break;
            } else {
                System.out.println("kiểu thuê phải viết hoa kí tự đầu, kí tự sau là chữ thường");
            }
        }
        return kieuThue;
    }

    public Double dienTichHoBoi() {
        while (true) {
            try {
                System.out.println("Mời nhập diện tích hồ bơi");
                Double dienTichHoBoi = Double.parseDouble(scanner.nextLine());
                if (dienTichHoBoi > 30) {
                    return dienTichHoBoi;
                } else {
                    throw new Exception();
                }
            } catch (Exception exception) {
                System.out.println("không được nhập diện tích hồ bơi <30");
            }
        }
    }

    public String tieuChuanPhong() {
        String tieuChuanPhong;
        while (true) {
            System.out.println("Mời nhập tiêu chuẩn phòng");
            tieuChuanPhong = scanner.nextLine();
            Pattern pattern = Pattern.compile("");
            if (pattern.matcher(tieuChuanPhong).find()) {
                return tieuChuanPhong;
            } else {
                System.out.println("Phải viết hoa kí tự đầu và kí tự sau là chữ thường");
            }
        }
    }

    public Integer soTang() {
        while (true) {
            try {
                System.out.println("Mời nhập số tầng");
                Integer soTang = Integer.parseInt(scanner.nextLine());
                if (soTang > 0) {
                    return soTang;
                } else {
                    throw new Exception();
                }
            } catch (Exception exception) {
                System.out.println("Không được nhập số tầng nhỏ hơn 0");
            }
        }
    }
}