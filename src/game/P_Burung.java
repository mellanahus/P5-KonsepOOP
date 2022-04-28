/* Percobaan menggunakan konsep inheritance
pada game (ini merupakan bagaian kelas P_Burung
 pada pakcage game */

package game;

public class P_Burung extends M_Enemy {
    public P_Burung(String name, int hp, int attackPoin) {
        super(name, hp, attackPoin);
    }
    void walk() {
        System.out.println("Burung berjalan");
    }
    void jump() {
        System.out.println("Burung loncat-loncat");
    }
    void fly() {
        System.out.println("Burung terbang ...");
    }
}
