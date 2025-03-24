public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(){
        super(4, "defaultWarna", "defaultBorder"); // Pastikan untuk menyesuaikan dengan konstruktor kelas induk
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    public double getDiagonal(){
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + getSisi());
        System.out.println("Luas Persegi: " + getLuas());
        System.out.println("Keliling Persegi: " + getKeliling());
        System.out.println("Diagonal Persegi: " + getDiagonal());
    }
}