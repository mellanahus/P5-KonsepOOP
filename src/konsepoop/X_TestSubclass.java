/* Percobaan memanggil overriding method yang ada
pada superclass didalam subclass */

package konsepoop;


class Parentclass {

    //Overridden method
    void display() {
        System.out.println("Parent class method");
    }
}
    public class X_TestSubclass extends Parentclass {

        //Overriding method
        @Override
        void display() {
            System.out.println("Child class method");
        }
        void printMsg() {
            // This would call Overriding  method
            display();
            // This would call Overridden  method
            super.display();
        }

        public static void main(String  args[]) {
            X_TestSubclass  obj = new X_TestSubclass();
            obj.printMsg();

        }
}