import java.math.*;

public class Tabung {
    int jariJari, tinggi;

    public Tabung(int jariJari, int tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double volumeTabung(){
        double pi = 3.14;
        return (pi*Math.pow(jariJari,2))*this.tinggi;
    }
}
