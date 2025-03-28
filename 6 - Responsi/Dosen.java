class Dosen extends Karyawan {
    private static int counter = 0;
    private Fakultas fakultas;

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counter++;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public double hitungGaji() {
        return getFakultas().getGajiPokok() * (1 + (getMasaKerja() * 0.01));
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println(("Fakultas: " + getFakultas().getNamaFakultas()));
        System.out.printf("Gaji: Rp %,.0f\n", hitungGaji());
    }
}