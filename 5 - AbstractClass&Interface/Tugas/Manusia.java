import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int CounterMns = 0;
    
    protected Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate tanggal = LocalDate.parse(tgl_mulai_kerja, formatter);
        this.tgl_mulai_kerja = tanggal;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        CounterMns++;
    }

    protected void setNama(String nama){
        this.nama = nama;
    }

    protected String getNama(){
        return nama;
    }

    protected void setTglMulaiKerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    protected LocalDate getTglMulaiKerja(){
        return tgl_mulai_kerja;
    }

    protected void setAlamat(String alamat){
        this.alamat = alamat;
    }

    protected String getAlamat(){
        return alamat;
    }

    protected void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    protected double getPendapatan(){
        return pendapatan;
    }

    public static int getCounterMns(){
        return CounterMns;
    }
    protected void cetakInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Mulai Kerja: " + getTglMulaiKerja());
        System.out.println("Alamat: " + getAlamat());
        System.out.printf("Pendapatan: %,.0f\n", getPendapatan());
    }

    public abstract double hitungMasaKerja();
}
