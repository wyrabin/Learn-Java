public class Persegi {
    int panjangSisi;

    public Persegi(int panjangSisi) {
        this.panjangSisi = panjangSisi;
    }
    public int luasPersegi() {
        return this.panjangSisi * this.panjangSisi;
    }
    public int kelilingPersegi(){
        return this.panjangSisi * 4;
    }
}
