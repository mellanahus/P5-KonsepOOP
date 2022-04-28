/* Percobaan memanggil kelas pada
suatu package (ini merupakan bagian kelas C_Kelas
 pada package perguruan_tinggi
 */

package perguruan_tinggi;

import java.util.ArrayList;
import java.util.List;

public class C_Kelas {
    private int kodeKelas;
    private String namaKelas;
    private List<D_Mahasiswa> daftarMahasiswa;

    public C_Kelas(int kodeKelas, String namaKelas){
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public int getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(int kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public List<D_Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public void setDaftarMahasiswa(List<D_Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    @Override
    public String toString() {
        StringBuilder myString = new StringBuilder();
        myString.append("Kode Kelas : ");
        myString.append(kodeKelas);
        myString.append("\tNama Kelas : ");
        myString.append(namaKelas);
        myString.append("\nDaftar Mahasiswa : ");
        daftarMahasiswa.forEach(D_Mahasiswa -> {
            myString.append("\n")
                    .append(D_Mahasiswa.getNama())
                    .append("\t")
                    .append(D_Mahasiswa.getNrp())
                    .append("/t")
                    .append(D_Mahasiswa.getTabungan().getNoRekening())
                    .append(D_Mahasiswa.getTabungan().getSaldo());
        });
        return myString.toString();
    }
}
