/* Nama File    : Asersi1.java
 * Deskripsi    : program untuk menunjukkan penggunaan asersi
 * Pembuat      : Indra Purwanto/24060123140150
 * Tanggal      : 7 Maret 2025
 */
public class Asersi1 {
    public static void main(String[] args){
        int x = 0;
        if (x>0){
            System.out.println("x adalah bilangan positif");
        } else {
            assert(x<0):"Ada kesalahan kode";
            System.out.println("x adalah bilangan negatif");
        }
    }
}