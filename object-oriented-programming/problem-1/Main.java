public class Main {
    public static void main(String[] args) {
        // Luas dan Keliling Persegi
        Persegi persegi1 = new Persegi(4);
        System.out.println("Luas persegi : " + persegi1.luasPersegi());
        System.out.println("Keliling persegi : " + persegi1.kelilingPersegi());

        // Luas dan Keliling Segitiga
        Segitiga segitiga1 = new Segitiga(3,4);
        System.out.println("Luas Segitiga :" + segitiga1.luasSegitiga());
        System.out.println("Keliling Segitiga :" + segitiga1.kelilingSegitiga());

        // Luas dan Keliling Persegi Panjang
        persegiPanjang persegiPanjang1 = new persegiPanjang(8,7);
        System.out.println("Luas Persegi Panjang :"+ persegiPanjang1.luasPersegiPanjang());
        System.out.println("Keliling Persegi Panjajang :"+ persegiPanjang1.kelilingPersegiPanjang());

    }
}