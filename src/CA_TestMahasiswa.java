/* Percobaan menjalankan test memanggil kelas pada
suatu package */

import akun_bank.E_Tabungan;
import java.util.ArrayList;
import java.util .List;
import perguruan_tinggi.C_Kelas;
import perguruan_tinggi.D_Mahasiswa;

public class CA_TestMahasiswa {
    public static void main(String[] args) {

        //buat 4 objek Mahasiswa atas nama Anton, Budi, Clarisa, dan Dono
        D_Mahasiswa anton = new D_Mahasiswa(1106310, "Anton");
        D_Mahasiswa budi = new D_Mahasiswa(1106311,  "Budi");
        E_Tabungan tBudi=  new E_Tabungan(1, 100000);
        budi.setTabungan(tBudi);
        D_Mahasiswa clarisa = new D_Mahasiswa(1106312, "Clarisa");
        E_Tabungan  tClarisa = new E_Tabungan(2, 150000);
        clarisa.setTabungan(tClarisa);
        D_Mahasiswa dono = new D_Mahasiswa(1106313, "Dono");
        E_Tabungan tDono = new E_Tabungan(3, 200000);
        dono.setTabungan(tDono);

        //buat 2 objek Kelas yaitu kelasRPL dan kelasTI
        C_Kelas kelasRPL = new C_Kelas(1, "Kelas RPL");
        C_Kelas kelasTI= new C_Kelas(2, "Kelas TI");

        //buat sebuah 2 objek List Mahasiswa yaitu daftarMahasiswaRPL  dan daftarMahasiswaTI
        List<D_Mahasiswa> daftarMahasiswaRPL = new ArrayList<>();
        daftarMahasiswaRPL.add(anton);
        daftarMahasiswaRPL.add(clarisa);
        kelasRPL.setDaftarMahasiswa(daftarMahasiswaRPL);

        List<D_Mahasiswa> daftarMahasiswaTI= new ArrayList<>();
        daftarMahasiswaTI.add(budi);
        daftarMahasiswaTI.add(dono);
        kelasTI.setDaftarMahasiswa(daftarMahasiswaTI);

        System.out.println("Data Kelas RPL\n" + kelasRPL.toString());
        System.out.println("\nData Kelas TI\n" + kelasTI.toString());
    }

}
