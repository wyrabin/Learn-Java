import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
    }

    private static boolean primeNumber(int number) {
        int cekPrime = 0; // variabel untuk cek apakah kondisi IF terpenuhi
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && number % 1 == 0)
                cekPrime++;
            }
            if (cekPrime == 2){
                return true;
            }else{
                return false;
            }
        }
    }

