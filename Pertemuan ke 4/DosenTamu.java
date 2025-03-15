import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate KontrakBerakhir;

    public DosenTamu(String NIP, String NIDK, String Nama, String Fakultas, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, LocalDate KontrakBerakhir) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.KontrakBerakhir = KontrakBerakhir;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    private String getNIDK(){
        return NIDK;
    }

    public void setKontrakBerakhir(LocalDate KontrakBerakhir){
        this.KontrakBerakhir = KontrakBerakhir;
    }

    private LocalDate getKontrakBerakhir(){
        return KontrakBerakhir;
    }

    private double getTunjangan(){
        return 0.025 * getGajiPokok();
    }
    
    @Override
    public void printInfo(){
        System.out.println("NIP: " + getNIP());
        System.out.println("NIDK: " + getNIDK());
        super.printInfo();
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("Kontrak Berakhir: " + formatTanggal(getKontrakBerakhir()));
        System.out.println("Gaji Pokok: Rp " + getGajiPokok());
        System.out.println("Tunjangan: 2.5% x " + Period.between(TMT, LocalDate.now()).getYears() + " x Rp " + getGajiPokok() + " = Rp " + getTunjangan());
    }
}
