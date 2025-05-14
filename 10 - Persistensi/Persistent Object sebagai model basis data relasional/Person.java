/*
 * Nama File  : Person.java
 * Deskripsi  : person database model
 * Pembuat    : Indra Purwanto (24060123140150)
 * Tanggal    : 14 mei 2025
*/
public class Person {
    private int id;
    private String name;
    
    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
