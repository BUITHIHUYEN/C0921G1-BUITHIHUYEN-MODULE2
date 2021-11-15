package bai_11_stack_queue.bai_tap.chuyen_he_thap_phan_sang_he_nhi_phan;

import sun.security.timestamp.TSRequest;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String result = " ";
        System.out.println("Nhập vào số thập phân cần chuyển");
        int number = scanner.nextInt();

        while  (number!=0){
            stack.push(number%2);
            number/=2;
        }
        while (!stack.empty()){
            result += stack.pop();
        }
        System.out.println("Hệ nhị phân: " +result);
    }

    }
