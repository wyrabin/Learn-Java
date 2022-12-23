import java.math.*;

public class Segitiga {
    int alas, tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int luasSegitiga() {
        return this.alas * this.tinggi / 2;
    }

    public int kelilingSegitiga() {
        double a = Math.pow(this.alas,2);
        double b = Math.pow(this.tinggi,2);
        double sisi = Math.sqrt(a+b);

        return (int) ((2*this.alas)+sisi);


    }
}
