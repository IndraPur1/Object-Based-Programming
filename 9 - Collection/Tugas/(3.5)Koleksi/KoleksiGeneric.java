/*
 * Nama File : Koleksi.java
 * Deskripsi : implementasi koleksi
 * Pembuat : Indra Purwanto (24060123140150)
 * Tanggal : 09 Mei 2025
*/
import java.util.ArrayList;

public class KoleksiGeneric <T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public KoleksiGeneric(){
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public T getIsi(int i){
        return wadah.get(i);
    }

    public void setIsi(int i, T isi){
        wadah.set(i, isi);
    }

    public int getSize(){
        return nbelm;
    }

    public void setSize(int i){
        nbelm = i;
    }

    public void add(T isi){
        wadah.add(isi);
        nbelm++;
    }

    public void delete(int i){
        wadah.remove(i);
        nbelm--;
    }

    public void showAll(){
        for(int i = 0; i < nbelm; i++){
            System.out.print(wadah.get(i) + " ");
        }
        System.out.println();
    }
}
