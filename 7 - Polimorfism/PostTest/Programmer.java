public class Programmer extends Pegawai {
    int bonus = 450000;

    public Programmer(String name){
        super(name);
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + getBonus());
    }
}

