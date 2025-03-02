public class MataKuliah {
    // Atribut
    private String IdMatkul;
    private String Matkul;
    private int sks;

    // Method
    // Konstruktor untuk membuat MataKuliah
    MataKuliah () {
        IdMatkul = "-";
        Matkul = "-";
        sks = 0;    
    }

    MataKuliah (String IdMatkul, String Matkul, int sks) {
        this.IdMatkul = IdMatkul;
        this.Matkul = Matkul;
        this.sks = sks;
    }

    // mengembalikan nilai IdMatkul
    public String getIdMatkul() {
        return IdMatkul;
    }

    // mengembalikan nilai Matkul
    public String getMatkul() {
        return Matkul;
    }

    // mengembalikan nilai sks
    public int getsks() {
        return sks;
    }

    // mengeset nilai IdMatkul
    public void setIdMatkul(String IdMatkul) {
        IdMatkul = IdMatkul;
    }

    // mengeset nilai Matkul
    public void setMatkul(String Matkul) {
        Matkul = Matkul;
    }

    // mengeset nilai sks
    public void setsks(int sks) {
        sks = sks;
    }

    public String PrintMatkul() {
        return getIdMatkul() + " (" + getMatkul() + " (" + getsks() + " SKS))";
    }
}
