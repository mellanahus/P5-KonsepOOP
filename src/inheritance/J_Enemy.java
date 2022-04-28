/* Percobaan menggunakan konsep inheritance
(ini merupakan bagian kelas induk kelas J_Enemy
 pada package inheritance)
*/

package inheritance;

public class J_Enemy {
    String name;
    int hp;
    int attackPoint;

    // memberikan constractor
    public J_Enemy() {
        this.name = "Musuh dalam selimut";
        this.hp = 999999999;
        this.attackPoint = 999999999;
    }

    void attack() {
        System.out.println("Serang !");
    }
}
