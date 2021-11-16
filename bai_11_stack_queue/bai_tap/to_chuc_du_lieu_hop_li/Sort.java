package bai_11_stack_queue.bai_tap.to_chuc_du_lieu_hop_li;

import java.util.Comparator;

public class Sort implements Comparator<CompanyPerson> {

    @Override
    public int compare(CompanyPerson o1, CompanyPerson o2) {
        String[] string1 = o1.getDateOfBirth().split("/");
        String[] string2 = o2.getDateOfBirth().split("/");
        String dateOfBirth1 = "";
        String dateOfBirth2 = "";
        for (int i = string1.length-1; i >=0; i--) {
            dateOfBirth1 += string1[i];
            dateOfBirth2 += string2[i];
        }
        return dateOfBirth1.compareTo(dateOfBirth2);
    }
    }
