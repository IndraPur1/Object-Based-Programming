public class Manajer extends Pegawai {
    public int tunjangan = 700000;

    public Manajer(String name){
        super(name);
    }

    int getTunjangan(){
        return tunjangan;
    }

    @Override
    void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + getTunjangan());
    }

}
