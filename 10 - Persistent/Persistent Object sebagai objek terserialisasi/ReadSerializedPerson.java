/*
 * Nama File  : ReadSerializePerson.java
 * Deskripsi  : Program untuk serialisasi objek person
 * Pembuat    : Indra Purwanto (24060123140150)
 * Tanggal    : 14 mei 2025
*/
import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println(("selesai menulis objek person = " + person.getName()));
        } catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}
