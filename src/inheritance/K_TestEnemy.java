/* Percobaan menggunakan konsep inheritance
(ini merupakan bagian kelas K_TestEnemy
 pada package inheritance)
*/


package inheritance;

public class K_TestEnemy {
    public static void main(String[] args) {

//        J_Enemy oyen = new J_Enemy();
//        System.out.println(oyen);
//        oyen.attack();

        H_Pocong pocong = new H_Pocong();
        System.out.println(pocong);
        pocong.attack();
        pocong.jump();
    }

}
