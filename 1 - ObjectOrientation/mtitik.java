/* Nama File    : mtitik.java
 * Deskripsi    : berisi method main untuk class titik
 * Pembuat      : Indra Purwanto
 * Tanggal      : 19 februari 2025
 */

public class mtitik {
    public static void main(String[] args) {
    titik t1 = new titik();
    t1.setAbsis(3);
    t1.setOrdinat(4);
    System.out.println("koordinat Titik t1");
    t1.printtitik();
    System.out.println("koordinat Titik t1 digeser sejauh 1,1");
    t1.geser(1, 1);
    t1.printtitik();

    titik t2 = t1;
    t2.printtitik();
    t1.setAbsis(10);
    t1.setOrdinat(10);
    t2.printtitik();

    t2 = new titik();
    titik t3 = new titik(3,5);
    t3.printtitik();
    t3.printtitik();

    System.out.println("Jumlah Objek titik = " + titik.getCountertitik());

    System.err.println("titik t1 berada di kuadran " + t1.getquadran());
    System.err.println("jarak titik t1 ke pusat koordinat = " + t1.getjarakpusat());
    System.out.println("jarak titik t1 ke titik t2 = " + t1.getjarak(t3));
    }
}