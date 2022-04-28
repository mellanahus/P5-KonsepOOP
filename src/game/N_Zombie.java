/* Percobaan menggunakan konsep inheritance
pada game (ini merupakan bagaian kelas N_Zombie
 pada pakcage game */

package game;

public class N_Zombie extends M_Enemy {
    public N_Zombie(String name, int hp, int attackPoin) {
        super(name, hp, attackPoin);
    }

    void walk() {
        System.out.println("Zombie jalan-jalan");
    }
    }
