import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.err.println("==========Dosen Tetap==============");
        DosenTetap dosenTetap = new DosenTetap("123", "321", "Sri Susanti", "FSM", LocalDate.of(1990, 1, 1), LocalDate.of(2010, 1, 1), 1000000);
        dosenTetap.setNIP("9545647548");
        dosenTetap.setNIDN("78647324");
        dosenTetap.setNama("Andi");
        dosenTetap.setTanggalLahir(LocalDate.of(1990, 5, 5));
        dosenTetap.setTMT(LocalDate.of(2015, 1, 1));
        dosenTetap.setGajiPokok(5000000);
        dosenTetap.printInfo();
        System.err.println("====================================");

        System.err.println("===========Dosen Tamu===============");
        DosenTamu dosenTamu = new DosenTamu("12345678", "87654321", "Susi", "FEB", LocalDate.of(1990, 1, 1), LocalDate.of(2010, 1, 1), 1000000, LocalDate.of(2025, 1, 1));
        dosenTamu.setNIP("293859285");
        dosenTamu.setNIDK("93847628713");
        dosenTamu.setNama("Budi");
        dosenTamu.setTanggalLahir(LocalDate.of(1990, 5, 5));
        dosenTamu.setTMT(LocalDate.of(2015, 1, 1));
        dosenTamu.setGajiPokok(5000000);
        dosenTamu.setKontrakBerakhir(LocalDate.of(2025, 1, 1));
        dosenTamu.printInfo();
        System.err.println("====================================");


        System.err.println("=============Tendik=================");
        Tendik tendik = new Tendik("01987349824u", "susanto", "Asisten", LocalDate.of(1990, 1, 1), LocalDate.of(2010, 1, 1), 1000000);
        tendik.setNIP("0192837465");
        tendik.setNama("Amel");
        tendik.setBidang("Tata Usaha");
        tendik.setTanggalLahir(LocalDate.of(1990, 5, 5));
        tendik.setTMT(LocalDate.of(2015, 1, 1));
        tendik.setGajiPokok(5000000);
        tendik.printInfo();
        System.err.println("====================================");
    }
}
