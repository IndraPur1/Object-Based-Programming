public class Segitiga extends BangunDatar {
    private double sisiright;
    private double sisileft;
    private double sisibase;
    private double tinggi;

    public Segitiga(double r, double l, double b, double t){
        this.sisiright = r;
        this.sisileft = l;
        this.sisibase = b;
        this.tinggi = t;
    }

    @Override
    public double hitungKeliling(){
        return sisiright + sisileft + sisiright; 
    }

    @Override
    public double hitungLuas(){
        return 0.5*sisibase*tinggi;
    }
}
