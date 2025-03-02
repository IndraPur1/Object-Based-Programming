import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    // Atribut
    private String NIM;
    private String Nama;
    private String Prodi;
    private List<MataKuliah> listMatkul;
    private Dosen DosenWali;
    private Kendaraan Kendaraan;

    // Method
    // Konstruktor untuk membuat Mahasiswa
    Mahasiswa() {
        NIM = "-";
        Nama = "-";
        Prodi = "-";
        listMatkul = new ArrayList<>();
        DosenWali = new Dosen();
        Kendaraan = new Kendaraan();
    }

    Mahasiswa(String NIM, String Nama, String Prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = new ArrayList<>();
    }

    // mengembalikan NIM Mahasiswa
    public String getNamaMhs() {
        return Nama;
    }

    // mmengembalikan Nama Mahasiswa
    public String getNIMMhs() {
        return NIM;
    }

    // mengembalikan Prodi Mahasiswa
    public String getProdiMhs() {
        return Prodi;
    }

    // mengembalikan listMatkul Mahasiswa
    public List<MataKuliah> getMatkul() {
        return listMatkul;
    }

    // mengembalikan Dosen Wali Mahasiswa
    public Dosen getDosenWali() {
        return DosenWali;
    }

    // mengembalikan Kendaraan Mahasiswa
    public Kendaraan getKendaraan() {
        return Kendaraan;
    }

    // mengeset NIM Mahasiswa
    public void setNIMMhs(String NIM) {
        this.NIM = NIM;
    }

    // mengeset Nama Mahasiswa
    public void setNamaMhs(String Nama) {
        this.Nama = Nama;
    }

    // mengeset list mata kuliah mahasiswa
    public void setListMatkul(List<MataKuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }

    // mengeset Dosen Wali Mahasiswa
    public void setDosenWali(Dosen dosenWali) {
        this.DosenWali = dosenWali;
    }

    // mengeset Kendaraan Mahasiswa
    public void setKendaraan(Kendaraan kendaraan) {
        this.Kendaraan = kendaraan;
    }

    // menambahkan Matkul dalam listMatkul
    public void addMatkul(MataKuliah MataKuliah) {
        listMatkul.add(MataKuliah);
    }

    // mengembalikan jumlah Mata Kuliah dalam listMatkul
    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    // mengembalikan jumlah SKS dalam Mata Kuliah Mahasiswa
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getsks();
        }
        return totalSKS;
    }

    // mengembalikan Data Mahasiswa
    public void printMhs() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama :" + getNamaMhs());
        System.out.println("NIM : " + getNIMMhs());
        System.out.println("Prodi : " + getProdiMhs());
    }

    // mengembalikan Data lengkap Mahasiswa
    public void printDetailMhs() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama: " + getNamaMhs());
        System.out.println("NIM: " + getNIMMhs());
        System.out.println("Prodi: " + getProdiMhs());
        System.out.println("Dosen Wali: " + getDosenWali().getNamaDsn() + " (NIP: " + getDosenWali().getNIP() + ", Prodi: " + getDosenWali().getProdiDsn() + ")");
        System.out.println("Mata Kuliah yang Diambil: ");
        for (MataKuliah mk : listMatkul) {
            System.out.println("- " + mk.getIdMatkul() + " (" + mk.getMatkul() + " (" + mk.getsks() + " SKS))");
        }
        System.out.println("Kendaraan: "+ getKendaraan().getjenis() + " (" + getKendaraan().getnoPlat() + ")");
        System.out.println("======================");
    }
}
