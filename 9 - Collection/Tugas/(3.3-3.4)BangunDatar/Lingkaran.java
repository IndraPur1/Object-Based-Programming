public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    @Override
    public double hitungKeliling(){
        return 2*3.14*jejari;
    }

    @Override
    public double hitungLuas(){
        return 3.14*jejari*jejari;
    }
}
