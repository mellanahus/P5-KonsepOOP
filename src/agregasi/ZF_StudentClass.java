/* Percobaan agregasi antar kelas StudentClass dan Address
(ini merupakan bagian kelas ZF_StudentClass pada
package agregasi
 */

package agregasi;

public class ZF_StudentClass {

    int rollNum;
    String studentName;
    //Creating HAS-A relationship with ZE_Address class
    ZE_Address studentZEAddress;


    ZF_StudentClass(int rollNum, String studentName, ZE_Address studentZEAddress) {
        this.rollNum = rollNum;
        this.studentName = studentName;
        this.studentZEAddress = studentZEAddress;
    }

    public static void main(String[] args) {
        ZE_Address ZEAddress = new ZE_Address(8,"Bengkalis","Riau","Indonesia");
        ZF_StudentClass obj= new ZF_StudentClass(123, "Budi Gunawan", ZEAddress);
        System.out.println("Roll Number : " + obj.rollNum);
        System.out.println("Student Name: " + obj.studentName);
        System.out.println("Street Number : " + obj.studentZEAddress.streetNum);
        System.out.println("City : " + obj.studentZEAddress.city);
        System.out.println("State : " + obj.studentZEAddress.state);
        System.out.println("Country : " + obj.studentZEAddress.country);

    }
    }
