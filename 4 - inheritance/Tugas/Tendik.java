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

    private LocalDate getBUP(){
        return TanggalLahir.plusYears(55).withDayOfMonth(1).plusMonths(1);
    }

    private double getTunjangan() {
        int masakerja = Period.between(TMT, LocalDate.now()).getYears();
        return 0.01 * masakerja * getGajiPokok();
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        super.printInfo();
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + getBidang());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("BUP: " + formatTanggal(getBUP()));
        System.out.printf("Gaji Pokok: %,.0f%n", getGajiPokok());
        System.out.printf("Tunjangan: 1%% x %d x Rp %,.0f = Rp %,.0f%n",
        Period.between(TMT, LocalDate.now()).getYears(), getGajiPokok(), getTunjangan());
    }
}
