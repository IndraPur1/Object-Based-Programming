import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int CounterPNS = 0;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        CounterPNS++;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNip(){
        return nip;
    }

    public static int getCounterPNS(){
        return CounterPNS;
    }

    public double hitungPajak(){
        return getPendapatan() * 0.1;
    }

    public double hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        return (now.getYear() - getTglMulaiKerja().getYear()) + 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + getNip());
    }
}
