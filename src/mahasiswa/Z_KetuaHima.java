/* Percobaan merubah rancangan kelas diagram kedalam kode
(ini merupakan bagian kelas Z_KetuaHima
pada package mahasiswa  */

package mahasiswa;

public class Z_KetuaHima extends  Y_Mahasiswa {

    private String jurusan;

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public Z_KetuaHima (String  nama, int nrp, String jurusan) {
        super(nama, nrp);
        this.jurusan = jurusan;

    }

    @Override
    public void info() {
        System.out.println(this.getNama() + '\n' + this.getNrp() + '\n' + jurusan);
    }

    @Override
    public String toString()  {
        String result= super.toString()  + ", jurusan="  + jurusan;
        return result;

    }
    }
