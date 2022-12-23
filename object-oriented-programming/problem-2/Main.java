import java.math.*;

public class Main {
    public static void main(String[] args) {

        // Volume Kubus
        Kubus kubus1 = new Kubus(10);
        System.out.println("Volume Kubus :"+ kubus1.volumeKubus());

        // Volume Balok
        Balok balok1 = new Balok(10,3,6);
        System.out.println("Volume Balok :"+ balok1.volumeBalok());

        // Volume Tabung
        Tabung tabung1 = new Tabung(7,10);
        System.out.println("Volume Tabung :"+ Math.round(tabung1.volumeTabung()));

    }
}