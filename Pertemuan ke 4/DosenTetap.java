import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String NIDN, String Nama, String Fakultas, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.NIDN = NIDN;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    private String getNIDN(){
        return NIDN;
    }

    private LocalDate getBUP(){
        return TanggalLahir.plusYears(65).withDayOfMonth(1).plusMonths(1);
    }

    private double getTunjangan(){
        int masakerja = Period.between(TMT, LocalDate.now()).getYears();
        return 0.02 * masakerja * GajiPokok;
    }

    @Override
    public void printInfo(){
        System.out.println("NIP: " + getNIP());
        System.out.println("NIDN: " + getNIDN());
        super.printInfo();
        System.out.println("Jabatan: Dosen Tetap"); 
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("BUP: " + formatTanggal(getBUP()));
        System.out.println("Gaji Pokok: Rp " + getGajiPokok());
        System.out.println("Tunjangan: 2% x " + Period.between(TMT, LocalDate.now()).getYears() + " x Rp " + getGajiPokok() + " = Rp " + getTunjangan());
    }
}
