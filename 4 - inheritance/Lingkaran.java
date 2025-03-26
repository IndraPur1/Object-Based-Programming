public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(){
        super(0, "defaultWarna", "defaultBorder"); // Pastikan untuk menyesuaikan dengan konstruktor kelas induk
    }

    public Lingkaran(String warna, String border, double jariJari){
        super(0, warna, border);
        this.jariJari = jariJari;
    }

    public double getJariJari(){
        return jariJari;
    }

    public void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }

    public double getLuas(){
        return Math.PI * jariJari * jariJari;
    }  

    public double getKeliling(){
        return 2 * Math.PI * jariJari;
    }

    public void printInfo(){
        System.out.println("Info Lingkaran");
        super.printInfo();
        System.out.println("Jari-jari: " + getJariJari());
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}