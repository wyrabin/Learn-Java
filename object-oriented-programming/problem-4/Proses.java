public class Proses extends OngkirApps{
    int minHarga = 5000;
    public void hitungHarga(){
        int dimensi = panjang*lebar*tinggi;
        if (dimensi<50){
            System.out.println(minHarga);
        }else{
            int pakaiBerat = (int) (berat*minHarga);
            System.out.println(pakaiBerat);
        }
    }
}

