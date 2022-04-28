/* Percobaan menjalankan penggunaan komposisi kelas Komputer
(ini merupakan bagian kelas ZL_TestKomputer
pada package komposisi
 */


package komposisi;

public class ZL_TestKomputer {
    public static void main(String[] args) {
        ZG_Komputer myComputer = new ZG_Komputer("PC01 ", 8000000);
        myComputer.displaySpec();
    }
}