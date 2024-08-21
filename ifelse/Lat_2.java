package pabass.ifelse;
import java.util.Scanner;

public class Lat_2 {
    public static void main(String[] args)
  {
    System.out.println("Program Untuk Cek Bilangan Positif/Negatif");
    System.out.println("=======================================");

    @SuppressWarnings("resource")
    Scanner inputValue = new Scanner(System.in);

    System.out.print("Masukkan bilangan: ");
    int angka = inputValue.nextInt();

    if (angka == 0) {
      System.out.println(angka + " Adalah bilangan Netral/Nol");
    } else if (angka > 0) {
      System.out.println(angka + " Adalah bilangan Positif");
    } else if (angka < 0) {
        System.out.println(angka + " Adalah bilangan Negatif");
    }
  }
}
