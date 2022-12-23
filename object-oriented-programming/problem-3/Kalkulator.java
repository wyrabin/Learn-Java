import java.util.Scanner;

public class Kalkulator {

    int angka1, angka2;

    public void inputJumlah() {
        System.out.println("Masukkan angka penjumlahan pertama: ");
        Scanner inputan = new Scanner(System.in);
        angka1 = inputan.nextInt();
        System.out.println("Masukkan angka penjumlahan kedua: ");
        angka2 = inputan.nextInt();
    }

    public void inputKurang() {
        System.out.println("Masukkan angka pengurangan pertama: ");
        Scanner inputan = new Scanner(System.in);
        angka1 = inputan.nextInt();
        System.out.println("Masukkan angka pengurangan kedua: ");
        angka2 = inputan.nextInt();
    }

    public void inputKali() {
        System.out.println("Masukkan angka perkalian pertama: ");
        Scanner inputan = new Scanner(System.in);
        angka1 = inputan.nextInt();
        System.out.println("Masukkan angka perkalian kedua: ");
        angka2 = inputan.nextInt();
    }

    public void inputBagi() {
        System.out.println("Masukkan angka pembagian pertama: ");
        Scanner inputan = new Scanner(System.in);
        angka1 = inputan.nextInt();
        System.out.println("Masukkan angka pembagian kedua: ");
        angka2 = inputan.nextInt();
    }

}

