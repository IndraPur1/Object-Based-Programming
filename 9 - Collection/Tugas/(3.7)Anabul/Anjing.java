public class Anjing extends Anabul{
        
    public Anjing(String name){
        super(name);
    }

    @Override
    public void Gerak(){
        System.out.println(getNama() + " adalah seekor anjing yang bergerak melata");
    }

    @Override
    public void Bersuara(){
        System.out.println(getNama() + " adalah seekor anjing yang bersuara guk-guk");
    }

}
