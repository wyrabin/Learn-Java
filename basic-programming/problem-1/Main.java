import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int alas, tinggi;


        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai alas : ");
        alas = input.nextInt();
        System.out.println("Masukkan nilai tinggi : ");
        tinggi = input.nextInt();

        System.out.println("=======================");

        int luasSegitiga = (alas*tinggi)/2;

        System.out.println("Luas segitiga : " + luasSegitiga);

    }
}