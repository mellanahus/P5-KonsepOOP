/* Percobaan penggunaan komposisi kelas Komputer
(ini merupakan bagian kelas ZJ_Monitor
pada package komposisi
 */

package komposisi;

public class ZJ_Monitor {

    private String merk;
    private int ukuranInch;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getUkuranInch() {
        return ukuranInch;
    }

    public void setUkuranInch(int ukuranInch) {
        this.ukuranInch = ukuranInch;
    }

    public ZJ_Monitor() {
        this.merk = "Intel HD Graphics";
        this.ukuranInch = 14;
    }

    public ZJ_Monitor(String merk, int ukuranInch) {
        this.merk = merk;
        this.ukuranInch = ukuranInch;
    }

    public void displaySpecMonitor() {
        System.out.println("Merk Monitor: " + merk);
        System.out.println("Ukuran Monitor (inch) :   " + ukuranInch);
    }
}