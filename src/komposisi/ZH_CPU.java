/* Percobaan penggunaan komposisi kelas Komputer
(ini merupakan bagian kelas ZH_CPU
pada package komposisi
 */

package komposisi;

public class ZH_CPU {

    private String merk;
    private double kecepatanGHz;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getKecepatanGHz() {
        return kecepatanGHz;
    }

    public void setKecepatanGHz(double kecepatanGHz) {
        this.kecepatanGHz = kecepatanGHz;
    }

    public ZH_CPU() {
        this.merk = "Intel Core-i3";
        this.kecepatanGHz = 2.5;
    }

    public ZH_CPU(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatanGHz = kecepatan;
    }

    public void displaySpecCPU() {
        System.out.println("Merk CPU: " + merk);
        System.out.println("Kecepatan CPU: " + kecepatanGHz);
    }
}