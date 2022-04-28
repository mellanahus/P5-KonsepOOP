/* Percobaan menjalankan method overriding
pada masalah bangun datar (ini merupakan kelas
 kelas W_TestBangunDatar pada package bangun_datar */

package bangun_datar;

public class W_TestBangunDatar {
    public static void main(String[] args) {
        // membuat objek bangun datar
        R_BangunDatar  bangunDatar  = new R_BangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        S_Persegi persegi = new S_Persegi();
        persegi .setSisi(2);

        // membuat objek Lingkaran dan mengisi nilai properti
        U_Lingkaran lingkaran = new U_Lingkaran();
        lingkaran.setJariJari(22);

        // membuat objek Persegi Panjang dan mengisi nilai properti
        T_PersegiPanjang persegiPanjang = new T_PersegiPanjang();
        persegiPanjang.setPanjang(8);
        persegiPanjang.setLebar(4);

        // membuat objek Segitiga dan mengisi nilai properti
        V_Segitiga mSegitiga = new V_Segitiga();
        mSegitiga.setAlas(6);
        mSegitiga.setTinggi(4);

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.println();

        persegi.luas();
        persegi.keliling();
        System.out.println();

        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();

        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println();

        mSegitiga.luas();
        mSegitiga.keliling();

    }
}
