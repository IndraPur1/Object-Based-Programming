import java.util.ArrayList;

public class Dosen {
    // Atribut
    private String NIP;
    private String Nama;
    private String Prodi;

    // Method
    // Konstruktor untuk membuat Dosen
    Dosen() {
        NIP = "0";
        Nama = "-";
        Prodi = "-";    
    }

    Dosen(String NIP, String Nama, String Prodi) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    // mengembalikan nilai NIP Dosen
    public String getNIP() {
        return NIP;
    }

    // mengembalikan nilai Nama Dosen
    public String getNamaDsn() {
        return Nama;
    }

    // mengembalikan nilai Prodi Dosen
    public String getProdiDsn() {
        return Prodi;
    }

    // mengeset nilai NIP Dosen
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // mengeset nilai Nama Dosen
    public void setNamaDsn(String Nama) {
        this.Nama = Nama;
    }

    // mengeset nilai Prodi Dosen
    public void setProdiDsn(String Prodi) {
        this.Prodi = Prodi;
    }

    public String PrintDosen() {
        return getNamaDsn() + " (NIP: " + getNIP() + ", Prodi: " + getProdiDsn() + ")";
    }
}
