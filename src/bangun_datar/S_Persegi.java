/* Percobaan mengimplementasi method overriding
pada masalah bangun datar (ini merupakan kelas
 kelas S_Persegi pada package bangun_datar */

package bangun_datar;

public class S_Persegi extends R_BangunDatar {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double  sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    @Override
    public double keliling() {
        double  keliling  = 4 * sisi;
        System.out.println("Keliling Persegi: "+ keliling);
        return keliling;
        }
    }
