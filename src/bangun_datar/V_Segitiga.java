/* Percobaan mengimplementasi method overriding
pada masalah bangun datar (ini merupakan kelas
 kelas V_Segitiga pada package bangun_datar */

package bangun_datar;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class V_Segitiga extends R_BangunDatar {

    private double alas;
    private double tinggi;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga : " + luas);
        return luas;
    }

    @Override
    public double keliling() {
        double sisiMiring = sqrt(pow(alas / 2.0, 2) + pow(tinggi, 2));
        double keliling = 2 * sisiMiring + alas;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }
}