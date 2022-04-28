/* Percobaan memanggil kelas pada
suatu package (ini merupakan bagian kelas D_Mahasiswa pada package perguruan_tinggi ) */

package perguruan_tinggi;

import akun_bank.E_Tabungan;

public class D_Mahasiswa {
    private int nrp;
    private String nama;
    private E_Tabungan tabungan;

    public D_Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
        this.tabungan = new E_Tabungan(0,5000000);
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public E_Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(E_Tabungan tabungan) {

        this.tabungan = tabungan;
    }
}

