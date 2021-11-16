package bai_11_stack_queue.bai_tap.to_chuc_du_lieu_hop_li;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<CompanyPerson> arrayList = new ArrayList<>();
        ArrayList<CompanyPerson> arrayListOutput = new ArrayList<>();
        arrayList.add(new CompanyPerson("Trần Văn Nam", "nam", "18/08/1993"));
        arrayList.add(new CompanyPerson("Nguyễn Văn Bình", "nam", "01/10/1995"));
        arrayList.add(new CompanyPerson("Nguyễn Thị Hiền", "nữ", "20/10/1996"));
        arrayList.add(new CompanyPerson("Nguyễn Văn Nam", "nam", "15/04/1991"));
        arrayList.add(new CompanyPerson("Nguyễn Thị Thu Huyền", "nữ", "11/03/1998"));
        arrayList.add(new CompanyPerson("Nguyễn Thị Thảo Vi", "nữ", "22/10/1990"));
        arrayList.add(new CompanyPerson("Nguyễn Văn Chánh", "nam", "18/01/2002"));

        Collections.sort(arrayList, new Sort());
        for (CompanyPerson e : arrayList) {
            System.out.println(e);
        }
        Queue<CompanyPerson> nam = new LinkedList<>();
        Queue<CompanyPerson> nu = new LinkedList<>();

        for (CompanyPerson person : arrayList){
            if (person.getGender().equals("nam")){
                nam.add(person);
            }else {
                nu.add(person);
            }
        }
        while (!nu.isEmpty()){
            arrayListOutput.add(nu.poll());
        }
        while (!nam.isEmpty()){
            arrayListOutput.add(nam.poll());
        }
        System.out.println("Sau khi tổ chức lại dữ liệu");
        for (CompanyPerson e : arrayListOutput) {
            System.out.println(e);
        }
    }

}
