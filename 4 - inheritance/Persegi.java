public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        super(4, "defaultWarna", "defaultBorder"); // Pastikan untuk menyesuaikan dengan konstruktor kelas induk
    }

    public Persegi(String warna, String border, double sisi){
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

    public void printInfo(){
        System.out.println("Info Persegi");
        super.printInfo();
        System.out.println("Sisi: " + getSisi());
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}