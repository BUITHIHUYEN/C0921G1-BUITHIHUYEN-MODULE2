package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.services.ContractService;
import java.util.LinkedList;
import java.util.Queue;

public class ContractServiceImpl extends Contract implements ContractService {
    static Queue<Contract> contractQueue = new LinkedList<>();
    static Queue<Booking> bookingQueue = new LinkedList<>();
    BookingServiceImpl bookingService = new BookingServiceImpl();
    @Override
    public void display() {

    }

    @Override
    public void add() {
        bookingQueue.addAll(bookingService.getBookings());
        Booking booking = bookingQueue.poll();


    }

    @Override
    public void edit(String maID) {

    }


}
