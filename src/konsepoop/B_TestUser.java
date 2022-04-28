package konsepoop;

// Percobaan menjalankan method setter dan getter yang dibuat secara otomatis


public class B_TestUser {
    public static void main(String[] args) {
        A_User dono = new A_User();
        //dono.username = '"Dono";  //error tidak bisa secara langsung mengakses atribut
        dono.setUsername("dono");
        dono.setPassword("123456");

        System.out.println("Info Akun");
        System.out.println("-------------");
        System.out.println("Nama : "+dono.getUsername());
        System.out.println("Password : "+dono.getPassword());
    }
}
