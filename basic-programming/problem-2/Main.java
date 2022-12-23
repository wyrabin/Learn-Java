import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String inputan;
        String hasil ="";
        Scanner input = new Scanner(System.in);
        inputan = input.nextLine();

        switch (inputan){
            case "A":
                hasil = "Memuaskan";
                break;
            case "B":
                hasil = "Baik";
                break;
            case "C":
                hasil = "Cukup";
            default:
                hasil = "Undefined";
                break;
        }
        System.out.println(hasil);
    }
}