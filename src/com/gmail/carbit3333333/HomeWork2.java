package com.gmail.carbit3333333;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = 1.4;
		double b = 1.4;
		double c = 1.7;
		
		double per = (a + b + c) / 2;
		
		double s = Math.sqrt((per*(per-a)*(per-b)*(per-c)));
		System.out.println(s);

	}

}
