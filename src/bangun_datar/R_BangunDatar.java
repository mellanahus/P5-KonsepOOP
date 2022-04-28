/* Percobaan mengimplementasi method overriding
pada masalah bangun datar (ini merupakan kelas induk
 kelas R_BangunDatar pada package bangun_datar */

package bangun_datar;

public class R_BangunDatar {
    protected double luas() {
        System.out.println("Method luas() superclass dipanggil");
        return 0;
    }

    protected double keliling() {
        System.out.println("Method keliling() superclass dipanggil");
        return 0;
    }
    }
