import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

abstract class Pegawai {
    protected String NIP;
    protected String Nama;
    protected LocalDate TanggalLahir;
    protected LocalDate TMT;
    protected double GajiPokok;

    protected Pegawai(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.GajiPokok = GajiPokok;
    }

    protected void setNIP(String NIP){
        this.NIP = NIP;
    }

    protected String getNIP(){
        return NIP;
    }

    protected void setNama(String Nama){
        this.Nama = Nama;
    }

    protected String getNama(){
        return Nama;
    }

    protected void setTanggalLahir(LocalDate TanggalLahir){
        this.TanggalLahir = TanggalLahir;
    }

    protected LocalDate getTanggalLahir(){
        return TanggalLahir;
    }

    protected void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    protected LocalDate getTMT(){
        return TMT;
    }

    protected void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }

    protected double getGajiPokok(){
        return GajiPokok;
    }

    protected String formatTanggal(LocalDate Date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return Date.format(formatter);
    }

    protected String getMasaKerja(){
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    protected void printInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + formatTanggal(getTanggalLahir()));
        System.out.println("TMT: " + formatTanggal(getTMT()));
        System.out.println("Gaji Pokok: " + getGajiPokok());
    }
}
