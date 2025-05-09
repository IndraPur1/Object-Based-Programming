/*
 * Nama File : Koleksi.java
 * Deskripsi : kelas koleksi generic untuk Anabul
 * Pembuat : Indra Purwanto (24060123140150)
 * Tanggal : 09 Mei 2025
*/
import java.util.ArrayList;
public class KoleksiGeneric <T> {
    private ArrayList<T> wadah = new ArrayList<>();

    public void add(T elemen){
        wadah.add(elemen);
    }

    public void showAll(){
        for (T elemen : wadah){
            if (elemen instanceof Anabul){
                Anabul anabul = (Anabul) elemen;
                System.out.println("Nama Anabul : " + anabul.nama);
                anabul.Gerak();
                anabul.Bersuara();
                System.out.println();
            }
        }
    }
}
