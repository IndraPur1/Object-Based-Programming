/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Indra Purwanto/24060123140150
 * Tanggal      : 7 Maret 2025
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial!");
    }
}