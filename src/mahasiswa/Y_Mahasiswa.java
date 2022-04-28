/* Percobaan merubah rancangan kelas diagram kedalam kode
(ini merupakan bagian kelas Y_Mahasiswa
pada package mahasiswa  */

package mahasiswa;

public class Y_Mahasiswa {

    private String nama;
    private int nrp;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public Y_Mahasiswa(String nama, int nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }

    void info() {
        System.out.println(nama + '\n' + nrp);
    }

    @Override
    public String toString() {
        StringBuilder  sb = new StringBuilder();
        sb.append("nama=").append(nama);
        sb.append(", nrp=").append(nrp);
        return sb.toString();
    }
}
