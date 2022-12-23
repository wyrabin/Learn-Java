import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int faktorBilangan;

        System.out.print("Faktor bilangan dari : ");
        Scanner input = new Scanner(System.in);
        faktorBilangan = input.nextInt();

        for (int i = 1; i <= faktorBilangan; i++){
            if (faktorBilangan % i == 0)
            System.out.println(i);
        }

    }
}