package bai_11_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
    Map<String, Integer> maps = new TreeMap<String, Integer>();
    String string = "Welcome to Japan 2022";
    String arr[] = string.toLowerCase().split(" ");
        for (String ele : arr) {
        if (!ele.equals("")) {
            if (maps.containsKey(ele)) {
                maps.put(ele, maps.get(ele) + 1);
            } else {
                maps.put(ele, 1);
            }
        }
    }
        System.out.println("Số lần xuất hiện của mỗi từ trong chuỗi: ");
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}


}