class Fakultas {
    private String namaFakultas;
    private double tarifUKT;
    private double gajiPokok;
    private static int counter = 0;

    public Fakultas(String namaFakultas, double tarifUKT, double gajiPokok) {
        this.namaFakultas = namaFakultas;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
        counter++;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public static int getCounter() {
        return counter;
    }

    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}