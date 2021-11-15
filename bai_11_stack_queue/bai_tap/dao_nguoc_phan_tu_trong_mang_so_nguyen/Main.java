package bai_11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n số phần tử của mảng số nguyên: ");
        int n  = scanner.nextInt();
        int[] arrays = new int[n];
        for(int i=0;i<arrays.length;i++) {
            arrays[i]= scanner.nextInt();
            stack.push(arrays[i]);
        }
        System.out.println("Dãy số của mảng :");
        for ( int i= 0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }
        System.out.println("Đảo ngược các phần tử:");
        for(int i=0;i<arrays.length;i++) {
            System.out.println(stack.pop());
        }



    }
}