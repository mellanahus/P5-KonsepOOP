/* Percobaan menggunakan konsep inheritance
pada game (ini merupakan bagaian kelas O_Pocong
 pada pakcage game */

package game;

public class O_Pocong extends M_Enemy {
    public O_Pocong(String name, int hp, int attackPoin) {
        super(name, hp, attackPoin);
    }
    void jump(){
        System.out.println("Pocong loncat-loncat!");
        }
        }
