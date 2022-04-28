// Percobaan penentuan method overriding yang dipanggil saat runtime

package konsepoop;

class Parent {
    //Overridden method
    public void display() {
        System.out.println("display()  method of parent class");
    }
}
    public class ZC_TestChild extends Parent {

        //Overriding method
        @Override
        public void display() {
            System.out.println("display()  method of Child class");
        }

        public static void main(String[] args) {
            Parent myParent = new Parent();
            myParent.display();

            Parent myChild = new ZC_TestChild();
            myChild.display();

        }
    }