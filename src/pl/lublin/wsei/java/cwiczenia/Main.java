package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0;
        do {

            System.out.print("Podaj pierwszą liczbę: ");
            num= input.nextInt();
            if (num== 0) break ;

            System.out.println("DEC = " + num);
            System.out.println("HEX = " + Integer.toHexString(num));
            System.out.println("BIN = " + Integer.toBinaryString(num));
        } while (true);
    }
}