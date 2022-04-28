/* Percobaan menjalankan konsep inheritance
pada game (ini merupakan bagaian kelas Q_TestGame
 pada pakcage game */

package game;

public class Q_TestGame {
    public static void main(String[] args) {
        N_Zombie zombie=  new N_Zombie("Zombie Land", 20, 2);
        O_Pocong pocong = new O_Pocong("Pocong  Kliwon", 25, 5);
        P_Burung burung = new P_Burung("Burung Hantu",  15,  1);
        System.out.println("Musuh 1");
        System.out.println("-----------------------");
        System.out.println("Nama: " + zombie.getName());
        System.out.println("Healty Power(HP):" + zombie.getHp());
        System.out.println("Attack Point: " + zombie.getAttackPoin());
        zombie.attack();
        zombie.walk();
        System.out.println();
        System.out.println("Musuh 2");
        System.out.println("-----------------------");
        System.out.println("Nama: " + pocong.getName());
        System.out.println("Healty Power(HP):" + pocong.getHp());
        System.out.println("Attack Point:  " + pocong.getAttackPoin());
        pocong.attack();
        pocong.jump();
        System.out.println();
        System.out.println("Musuh 3");
        System.out.println("------------------");
        System.out.println("Nama: " + burung.getName());
        System.out.println("Healty Power(HP):" + burung.getHp());
        System.out.println("Attack Point:  " + burung.getAttackPoin());
        burung.attack();
        burung.walk();
        burung.jump();
        burung.fly();

    }
}
