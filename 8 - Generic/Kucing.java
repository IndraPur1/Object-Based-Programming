public class Kucing extends Anabul {
    
    public Kucing(String name){
        super(name);
    }

    @Override
    public void Gerak(){
        System.out.println(getNama() + " adalah seekor kucing yang bergerak melata");
    }

    @Override
    public void Bersuara(){
        System.out.println(getNama() + " adalah seekor kucing yang bersuara meong");
    }

}
