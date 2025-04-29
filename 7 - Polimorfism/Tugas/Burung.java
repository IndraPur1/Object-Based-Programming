public class Burung extends Anabul {
        
    public Burung(String name){
        super(name);
    }

    @Override
    public void Gerak(){
        System.out.println(getNama() + " adalah seekor burung yang bergerak terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println(getNama() + " adalah seekor burung yang bersuara cuit");
    }

}
