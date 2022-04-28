/* Percobaan menggunakan konsep inheritance
(ini merupakan bagian kelas H_Pocong
 pada package inheritance)
*/


package inheritance;

public class H_Pocong extends J_Enemy {

    public H_Pocong (){
        this.name = "Si pocong kredit";
        this.hp = 5;
        this.attackPoint = 10;
    }

    void jump() {
        System.out.println("Pocong Loncat-Loncat !");
    }
}
