public class Anabul {
    public String nama;

    public Anabul(String name){
        nama = name;
    }

    void setNama(String name){
        nama = name;
    }

    String getNama(){
        return nama;
    }

    public void Gerak(){
        System.out.println("melata/terbang");
    }
    public void Bersuara(){
        System.out.println("meong/guk-guk/cuit");
    }
}
