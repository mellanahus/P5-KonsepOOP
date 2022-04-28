// Percobaan penentuan method overloading yang dipanggil saat kompilasi

package overloading;

public class ZB_Polymorphism {

    static void printNumber(int n){
        System.out.println("Using printNumber(int n)");
        System.out.println(n + "\n");
    }

    static void printNumber(char n) {
        System.out.println("Using printNumber(char n)");
        System.out.println(n + "\n");
    }

    static void printNumber(double n) {
        System.out.println("Using printNumber(double n)");
        System.out.println(n + "\n");
    }

    static void printNumber(int n, String str) {
        System.out.println("Using printNumber(n:lnt, str:String)");
        System.out.println(str + n + "\n");
    }

    public static void main(String[] args) {
        int a = 99;
        char b = 48;
        double c = 3.1;
        printNumber(a);
        printNumber(b);
        printNumber(c);
        printNumber(a, "Overloading function ");

    }
    }