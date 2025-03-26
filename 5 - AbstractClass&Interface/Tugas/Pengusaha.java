import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int CounterPengusaha = 0;

    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        CounterPengusaha++;
    }
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    public String getNpwp(){
        return npwp;
    }

    public static int getCounterPengusaha(){
        return CounterPengusaha;
    }

    public double hitungPajak(){
        return getPendapatan() * 0.15;
    }

    public double hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        return (now.getYear() - getTglMulaiKerja().getYear()) + 5;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + getNpwp());
    }
}
