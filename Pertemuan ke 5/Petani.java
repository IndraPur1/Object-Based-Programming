import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int CounterPetani = 0;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        CounterPetani++;
    }

    public void setAsalKota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    public String getAsalKota(){
        return asal_kota;
    }

    public static int getCounterPetani(){
        return CounterPetani;
    }

    public double hitungPajak(){
        return 0;
    }

    public double hitungMasaKerja(){
        LocalDate now = LocalDate.now();
        return (now.getYear() - getTglMulaiKerja().getYear()) + 1;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kora: " + getAsalKota());
    }
}