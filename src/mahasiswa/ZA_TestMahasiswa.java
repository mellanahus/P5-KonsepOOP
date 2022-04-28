/* Percobaan menjalankan rancangan kelas diagram kedalam kode
(ini merupakan bagian kelas ZA_TestMahasiswa
pada package mahasiswa  */

package mahasiswa;

public class ZA_TestMahasiswa {
    public static void main(String[] args) {

        // TODO code application logic here
        Y_Mahasiswa anton = new Z_KetuaHima("Anton", 1106789, "Teknik Informatika");
        anton.info();
        System.out.println("Jenis Kelas = " + anton.getClass().getSimpleName());
        System.out.println();

        Y_Mahasiswa budi = new Y_Mahasiswa("Budi  Gunawan", 1106123);
        budi.info();
        System.out.println("Jenis Kelas = " + budi.getClass().getSimpleName());
        System.out.println(budi.toString());
        System.out.println();

        Z_KetuaHima ucok = new Z_KetuaHima("Ucok", 1105239, "Teknik Elektro");
        ucok.info();
        System.out.println("Jenis Kelas = " + ucok.getClass().getSimpleName());
        System.out.println();

        Y_Mahasiswa butet = new Z_KetuaHima("Butet  Sitorus", 1106789, "Bahasa lnggris");
        butet.info();
        System.out.println("Jenis Kelas = " + butet.getClass().getSimpleName());
        System.out.println(butet.toString());
    }
}