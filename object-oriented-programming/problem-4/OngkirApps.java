import java.util.Scanner;

public class OngkirApps {
    int panjang, lebar, tinggi, berat;

    public void input() {
        System.out.println("Berapa panjang :");
        Scanner inputPanjang = new Scanner(System.in);
        panjang = inputPanjang.nextInt();
        System.out.println("Berapa lebar :");
        Scanner inputLebar = new Scanner(System.in);
        lebar = inputLebar.nextInt();
        System.out.println("Berapa Tinggi :");
        Scanner inputTinggi = new Scanner(System.in);
        tinggi = inputTinggi.nextInt();
        System.out.println("Berapa berat :");
        Scanner inputBerat = new Scanner(System.in);
        berat = inputBerat.nextInt();
    }
}
