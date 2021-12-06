package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Employee;
import case_study.readwrite.FileWriterReader;
import case_study.services.ContractService;

import java.util.*;

public class ContractServiceImpl extends Contract implements ContractService {
    final String PATH ="D:\\CODEGYMMODULE2\\C0921G1-BUITHIHUYEN-MODULE2\\src\\case_study\\data\\contract.csv";
    static Queue<Contract> contracts;
    static Queue<Booking> bookingQueue = new LinkedList<>();
    BookingServiceImpl bookingService = new BookingServiceImpl();


     {
//        contracts = covertStringToContract();
//        tring soHopDong, String maBooking, double soTienCocTruoc,
//        double tongSoTienThanhToan, String maKhachHang)
//        Contract contract1 = new Contract("A01", "K1", 2000000, 30000000, "AAA2");
//        Contract contract2 = new Contract("A02", "K2", 1000000, 20000000, "AAA13");
//        Contract contract3 = new Contract("A03", "K3", 3000000, 50000000, "AAA11");
//        contracts.add(contract1);
//        contracts.add(contract2);
//        contracts.add(contract3);
    }
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Contract contract :contracts) {
            System.out.println(contract);
        }
    }
    @Override
    public void add() {
        bookingQueue.addAll(bookingService.getBookings());
        Booking booking = bookingQueue.poll();

        List<String> stringList = covertContractToString();
        FileWriterReader.writeFile(PATH, stringList, false);
    }

    @Override
    public void edit(String maID) {

    }
    public List<Contract> covertStringToContract() {
        List<String> stringList = FileWriterReader.readFile(PATH);
        List<Contract> contractList = new ArrayList<>();
        String[] arrContract;
        for (String line : stringList) {
            arrContract = line.split(",");
            contractList.add(new Contract(arrContract[0],arrContract[1],Double.parseDouble(arrContract[2]),
                  Double.parseDouble(arrContract[3]), arrContract[4]));
        }
        return contractList;
    }


    public List<String> covertContractToString() {
        List<String> listString = new ArrayList<>();
        for (Contract contract : contracts) {
            listString.add(contract.toString());
        }
        return listString;
    }


}
