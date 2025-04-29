abstract class CivitasAkademika {
    protected static int counter = 0;
    protected String nama;
    protected String email;

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
        counter++;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCounter() {
        return counter;
    }
    public abstract void tampilkanInformasi();
}