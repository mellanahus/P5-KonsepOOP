/* Percobaan mengimplementasi method overriding
pada masalah bangun datar (ini merupakan kelas
 kelas U_Lingkaran pada package bangun_datar */

package bangun_datar;

public class U_Lingkaran extends R_BangunDatar {

    private double jariJari;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        double luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkaran : " + luas);
        return luas;
    }

    @Override
    public double keliling() {
        double keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling Lingkaran : " + keliling);
        return keliling;
    }
}
