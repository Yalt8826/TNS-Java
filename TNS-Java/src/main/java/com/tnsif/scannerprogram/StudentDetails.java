package com.tnsif.scannerprogram;

import java.util.Scanner;

public class StudentDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Name : ");
        String name = sc.nextLine();
        System.out.println("Enter the Student USN : ");
        int usn = sc.nextInt();
        System.out.println("Enter the Student Age");
        int age = sc.nextInt();

        System.out.println("Name : "+name+"\nUSN : "+usn+"\nAge : "+age);
    }
}
