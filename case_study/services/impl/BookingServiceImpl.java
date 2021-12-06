package case_study.services.impl;

import case_study.models.Booking;
import case_study.readwrite.FileWriterReader;
import case_study.services.BookingService;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    final String PATH = "D:\\CODEGYMMODULE2\\C0921G1-BUITHIHUYEN-MODULE2\\src\\case_study\\data\\booking.csv";
    static Set<Booking> bookings = new TreeSet<>(new BookingComparator());

    {
        bookings = covertStringToBooking();
        Booking booking1 = new Booking("A123", "20/10/2121", "19/11/2021", "A1234567", "Villa", "Vip");
        Booking booking2 = new Booking("A234", "18/11/2021", "17/12/2021", "A1234568", "Room", "Vip");
        Booking booking3 = new Booking("A456", "20/12/2021", "19/1/2022", "A1234569", "House", "Vip");
        bookings.add(booking1);
        bookings.add(booking2);
        bookings.add(booking3);
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    CustomerServiceImpl customerService = new CustomerServiceImpl();

    @Override
    public void add() {
        Booking booking = new Booking();
        System.out.println("Nhập mã booking");
        booking.setMaBooking(scanner.nextLine());
        System.out.println("Nhập ngày bắt đầu");
        booking.setNgayBatDau(scanner.nextLine());
        System.out.println("Nhập ngày kết thúc");
        booking.setMaKhachHang(scanner.nextLine());
        System.out.println("Nhập tên dịch vụ");
        booking.setTenDichVu(scanner.nextLine());
        System.out.println("Nhập loại dịch vụ");
        booking.setLoaiDichVu(scanner.nextLine());
        Booking bookings = new Booking();
        customerService.display();
        bookings.setMaKhachHang(customerService.maKhachHang());
        System.out.println(bookings.getMaKhachHang());
        List<String> stringList = covertCustomerToString();
        FileWriterReader.writeFile(PATH, stringList, false);
    }

    @Override
    public void edit(String maID) {
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public Set<Booking> covertStringToBooking() {
        List<String> stringList = FileWriterReader.readFile(PATH);
        Set<Booking> bookingList = new TreeSet<>(new BookingComparator());
        String[] arrBooking;
        for (String line : stringList) {
            arrBooking = line.split(",");
            bookingList.add(new Booking(arrBooking[0], arrBooking[1], arrBooking[2],
                    arrBooking[3], arrBooking[4], arrBooking[5]));
        }
        return bookingList;
    }

    public List<String> covertCustomerToString() {
        List<String> listString = new ArrayList<>();
        for (Booking booking : bookings) {
            listString.add(booking.toString());
        }
        return listString;
    }
}
