/* Percobaan penggunaan komposisi kelas Komputer
(ini merupakan bagian kelas ZI_RAM
pada package komposisi
 */

package komposisi;

public class ZI_RAM {

    private String merk;
    private int kapasitasMB;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getKapasitasMB() {
        return kapasitasMB;
    }

    public void setKapasitasMB(int kapasitasMB) {
        this.kapasitasMB = kapasitasMB;
    }

    public ZI_RAM() {
        this.merk = "Kingstones";
        this.kapasitasMB = 8000;
    }

    public ZI_RAM(String merk, int kapasitasMB) {
        this.merk = merk;
        this.kapasitasMB = kapasitasMB;
    }

    public void displaySpecRAM() {
        System.out.println("Merk RAM:" + merk);
        System.out.println("Kapasitas RAM (MB) :   " + kapasitasMB);
    }
}