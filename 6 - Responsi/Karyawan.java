abstract class Karyawan extends CivitasAkademika {
    protected static int counter = 0;
    protected String nip;
    protected int masaKerja;

    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
        counter++;
    }

    public String getNip() {
        return nip;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public static int getCounter() {
        return counter;
    }

    public abstract double hitungGaji();

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIP: " + getNip());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
    }
}