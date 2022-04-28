/* Percobaan penggunaan komposisi kelas Komputer
(ini merupakan bagian kelas ZK_Keyboard
pada package komposisi
 */

package komposisi;

public class ZK_Keyboard {

    private String merk;
    private String jenisKomunikasi;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenisKomunikasi() {
        return jenisKomunikasi;
    }

    public void setJenisKomunikasi(String jenisKomunikasi) {
        this.jenisKomunikasi = jenisKomunikasi;
    }

    public ZK_Keyboard() {
        this.merk = "Acer";
        this.jenisKomunikasi = "Wireless";
    }

    public ZK_Keyboard(String merk, String jenisKomunikasi) {
        this.merk = merk;
        this.jenisKomunikasi = jenisKomunikasi;
    }

    public void displaySpecKeyboard() {
        System.out.println("Merk Keyboard :" + merk);
        System.out.println("Jenis Komunikasi :" + jenisKomunikasi);
    }
}