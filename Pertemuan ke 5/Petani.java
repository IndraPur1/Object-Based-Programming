import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    private String nik;
    private static int CounterPetani = 0;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nik){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nik = nik;
        CounterPetani++;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public String getNik(){
        return nik;
    }

    public static int getCounterPetani(){
        return CounterPetani;
    }

    public double hitungPajak(){
        return getPendapatan() * 0.15;
    }

    public double hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        return (now.getYear() - getTglMulaiKerja().getYear()) + 1;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIK: " + getNik());
    }
}