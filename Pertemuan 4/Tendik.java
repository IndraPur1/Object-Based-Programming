import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tendik extends Pegawai {
    private String Bidang;

    public Tendik(String nip, String nama, String Bidang, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.Bidang = Bidang;
    }

    public void setBidang(String Bidang) {
        this. Bidang = Bidang;
    }

    private String getBidang() {
        return Bidang;
    }

    private double getTunjangan() {
        return 0.01 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT: " + formatTanggal(getTMT()));
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + getBidang());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Tunjangan: 1% x " + Period.between(TMT, LocalDate.now()).getYears() + " x Rp " + getGajiPokok() + " = Rp " + getTunjangan());
    }
}
