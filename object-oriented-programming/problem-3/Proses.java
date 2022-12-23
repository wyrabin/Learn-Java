public class Proses extends Kalkulator {

    int hasil;

    public void carajumlah() {
        hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan : " + hasil);
    }

    public void caraKurang() {
        hasil = angka1 - angka2;
        System.out.println("Hasil pengurangan : " + hasil);

    }

    public void caraKali() {
        hasil = angka1 * angka2;
        System.out.println("Hasil perkalian : " + hasil);

    }

    public void caraBagi() {
        hasil = angka1 / angka2;
        System.out.println("Hasil pembagian : " + hasil);

    }
}
