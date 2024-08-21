package pabass.ifelse;

import java.util.Scanner;

public class Lat_1 {
    public static void main(String[] args) {
        System.out.println("Program Untuk Cek Bilangan Ganjil/Genap");
        System.out.println("=======================================");

        @SuppressWarnings("resource")
        Scanner inputValue = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = inputValue.nextInt();

        if (angka != 0) {
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah bilangan genap");
            } else {
                System.out.println(angka + " adalah bilangan ganjil");
            }

        }
        if (angka == 0) {
            System.out.println(angka + " adalah bilangan Netral/Nol");
        }
    }
}
