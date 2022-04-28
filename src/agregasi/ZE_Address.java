/* Percobaan agregasi antar kelas StudentClass dan Address
(ini merupakan bagian kelas ZE_Address pada
package agregasi
 */

package agregasi;

public class ZE_Address {

    int streetNum;
    String city;
    String state;
    String country;

    ZE_Address(int streetNum, String city, String state, String country) {
        this.streetNum = streetNum;
        this.city = city;
        this.state = state;
        this.country = country;
        }
    }
