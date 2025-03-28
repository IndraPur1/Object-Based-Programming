class Tendik extends Karyawan {
    private static int counter = 0;

    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public double hitungGaji() {
        return 4000000 * (1 + (getMasaKerja() * 0.01));
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.printf("Gaji: Rp %,.0f\n", hitungGaji());
    }
}