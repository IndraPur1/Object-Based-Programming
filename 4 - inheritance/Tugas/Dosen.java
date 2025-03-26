import java.time.LocalDate;

abstract class Dosen extends Pegawai {
    protected String Fakultas;

    public Dosen(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String Fakultas) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.Fakultas = Fakultas;
    }

    protected void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }

    protected String getFakultas() {
        return Fakultas;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: " + getFakultas());
    }
}