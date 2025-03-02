public class Kendaraan {
    // Atribut
    private String noPlat;
    private String jenis;

    // Method
    // Konstruktor untuk membuat Kendaraan
    Kendaraan() {
        noPlat = "-";
        jenis = "-";
    }

    Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // mengembalikan nilai noPlat motor
    public String getnoPlat() {
        return noPlat;
    }

    // mengembalikan nilai jenis motor
    public String getjenis() {
        return jenis;
    }

    // mengeset noPlat motor
    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // mengeset  jenis
    public void setjenis(String jenis) {
        this.jenis = jenis;
    }

    public String PrintKendaraan() {
        return getjenis() + " (" + getnoPlat() + ")";
    }
}
