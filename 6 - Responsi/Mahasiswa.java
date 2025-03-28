class Mahasiswa extends CivitasAkademika {
    private static int counter = 0;
    private String nim;
    private int semester;
    private Fakultas fakultas;

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }

    public String getNim() {
        return nim;
    }

    public int getSemester() {
        return semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public static int getCounter() {
        return counter;
    }

    public double hitungUKT() {
        return getFakultas().getTarifUKT() * Math.pow(0.95, getSemester() - 1);
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIM: " + getNim());
        System.out.println("Semester: " + getSemester());
        System.out.println("Fakultas: " + getFakultas().getNamaFakultas());
        System.out.printf("Biaya UKT: Rp %,.0f\n", hitungUKT());
    }
}
