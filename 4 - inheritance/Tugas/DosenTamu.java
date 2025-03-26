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
        System.out.println("Masa Kontrak: " + getMasaKerja());
        System.out.println("Kontrak Berakhir: " + formatTanggal(getKontrakBerakhir()));
        System.out.printf("Gaji Pokok: %,.0f%n", getGajiPokok());
        System.out.printf("Tunjangan: 2,5%% x Rp %,.0f = Rp %,.0f%n", getGajiPokok(), getTunjangan());
    }
}
