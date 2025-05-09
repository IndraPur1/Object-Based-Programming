/*
 * Nama File : Koleksi.java
 * Deskripsi : main class untuk koleksi generic
 * Pembuat : Indra Purwanto (24060123140150)
 * Tanggal : 09 Mei 2025
*/

public class KoleksiMain {
    public static void main(String[] args) {
        KoleksiGeneric<Character> kg = new KoleksiGeneric<>();

        kg.add('D');
        kg.add('O');
        kg.add('N');
        kg.add('I');
        System.out.println("Elemen ke 1: " + kg.getIsi(0));
        kg.showAll();
        System.out.println("Jumlah elemen: " + kg.getSize());
        kg.setIsi(0, 'T');
        kg.showAll();
        kg.delete(3);
        System.out.println("Jumlah elemen: " + kg.getSize());
        kg.showAll();
        kg.setSize(2);
        System.out.println("Jumlah elemen: " + kg.getSize());
        kg.showAll();
    }
}

