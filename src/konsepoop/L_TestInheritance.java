/* Percobaan menggunakan keyword super
 pada inheritance */


package konsepoop;

class ParentClass {
    int id;

    // Parent class consrtuctor
    ParentClass() {
        id = 7;
        System.out.println("Constructor of Parent");
    }
}

public class L_TestInheritance extends ParentClass {
    int id;

    // Child class constructor
    L_TestInheritance() {
            /* secara implisit melibatkan konstruktor
            default parent class gunakan super()untuk
            merujuk ke konstruktor parent class super() ini harus diletakkan di baris awal
             */

        this.id = 9;
        System.out.println("Constructor of Child");
    }

    void printId() {
        System.out.println("Id  kelas TestInheritance: " + this.id);
        System.out.println("Id  kelas ParentClass: " + super.id);
    }

    public static void main(String args[]) {
        //Creating the object of child class
        L_TestInheritance testInheritance = new L_TestInheritance();
        testInheritance.printId();
    }
}