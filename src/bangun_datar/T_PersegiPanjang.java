/* Percobaan mengimplementasi method overriding
pada masalah bangun datar (ini merupakan kelas
 kelas T_PersegiPanjang pada package bangun_datar */


package bangun_datar;

public class T_PersegiPanjang extends R_BangunDatar {

    private double panjang;
    private double lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
        return luas;
    }

    @Override
    public double keliling() {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi panjang : " + keliling);
        return keliling;
    }
}
