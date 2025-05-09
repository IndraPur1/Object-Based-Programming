public class PersegiPanjang extends BangunDatar {
    private double lebar;
    private double panjang;

    public PersegiPanjang(double lebar, double panjang){
        this.lebar = lebar;
        this.panjang = panjang;
    }

    @Override
    public double hitungKeliling(){
        return 2*(panjang + lebar);
    }

    @Override
    public double hitungLuas(){
        return panjang * lebar;
    }
}
