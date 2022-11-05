public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String nama;
    int nomorHP;

    public void setNama(String nama){
        this.nama=nama;
    }

    public void setNomorHP(int nomorHP){
        this.nomorHP=nomorHP;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void registrasi(){
        System.out.println("Registrasi Berhasil!");
        System.out.println("Nama    : " +nama);
        System.out.println("Nomor HP    : " +nomorHP);
    }


}
