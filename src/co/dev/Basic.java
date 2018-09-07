package co.dev;

import java.util.Scanner;

public class Basic {
	
    public static void main(String[] args) {
//		System.out.println("Nhap so nguyen can tinh tong");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
    	int Tong = 0;
        for (int value = 1; value <= 100; value++) {
            Tong = Tong + value;
        } 
        System.out.println("Tổng là = " + Tong);
    }
 
}