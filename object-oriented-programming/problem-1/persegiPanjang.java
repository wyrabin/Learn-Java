public class persegiPanjang {
    int panjang, lebar;

    public persegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luasPersegiPanjang(){
        return this.panjang*this.lebar;
    }

    public int kelilingPersegiPanjang(){
        return ((2*this.panjang)+(2*this.lebar));
    }
}
