/*
 * Nama File  : Anabul.java
 * Deskripsi  : Superclass abstrak Anabul dengan atribut, konstruktor,
 *              selektor, mutator, abstract methods, dan fitur tambahan
 * Pembuat    : Indra Purwanto (24060123140150)
 * Tanggal    : 27 April 2025
*/

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
