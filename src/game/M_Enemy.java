/* Percobaan menggunakan konsep inheritance
pada game (ini merupakan bagaian kelas M_Enemy
 pada pakcage game */

package game;

public class M_Enemy {
    private String name;
    private int hp;
    private int attackPoin;

    public String getName() {
        return name;
    }

    public void setName(String  name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPoin() {
        return attackPoin;
    }

    public void setAttackPoin(int  attackPoin) {
        this.attackPoin = attackPoin;
    }

    public M_Enemy(String name, int hp, int attackPoin) {
        this.name = name;
        this.hp = hp;
        this.attackPoin = attackPoin;
    }

    void attack(){ System.out.println("Serang!");
    }
}
