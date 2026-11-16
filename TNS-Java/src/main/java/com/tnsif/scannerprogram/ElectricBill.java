package com.tnsif.scannerprogram;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer Name : ");
        String name = sc.nextLine();
        System.out.println("Enter the Units Consumed : ");
        int units = sc.nextInt();

        double bill;

        if(units<-100) {
            bill = units*2;
        }
        else if(units<=200) {
            bill = 200+(units-100)*3;
        }
        else {
            bill = 500 + (units-200)*5;
        }
        System.out.println("Name : "+name);
        System.out.println("Bill Amount : "+bill);
    }
}
