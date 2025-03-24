public class Lingkaran extends BangunDatar implements IResize{
    private double jariJari;

    public Lingkaran(){
        super(0, "defaultWarna", "defaultBorder"); // Pastikan untuk menyesuaikan dengan konstruktor kelas induk
        setJmlSisi(0);
    }

    public Lingkaran(double jariJari, String warna, String border){
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

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + getJariJari());
        System.out.println("Luas Lingkaran: " + getLuas());
        System.out.println("Keliling Lingkaran: " + getKeliling());
    }
}