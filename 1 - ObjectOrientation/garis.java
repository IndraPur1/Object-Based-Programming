/* Nama File    : garis.java
 * Deskripsi    : berisi atribut dan method dalam class garis
 * Pembuat      : Indra Purwanto
 * Tanggal      : 19 februari 2025
 */

public class garis {
    // Atribut
    titik titikawal;
    titik titikakhir;
    static int countergaris = 0;

    // Method
    // Konstruktor untuk membuat 
    garis() {
        titikawal = new titik(0,0);
        titikakhir = new titik(1,1);
        countergaris++;
    }
    
    garis (titik x, titik y) {
        this.titikawal = x;
        this.titikakhir = y;
        countergaris++;
    } 

    // mengembalikan nilai titikawal
    titik getTitikawal() {
        return titikawal;
    }

    // mengembalikan nilai titikakhir
    titik getTitikakhir() {
        return titikakhir;
    }

    //mengembalikan nilai countergaris
    static int getCountergaris() {
        return countergaris;
    }

    // mengeset nilai titikawal dengan nilai baru
    void setTitikawal(titik titikawal) {
        this.titikawal = titikawal;
    }

    // mengeset nilai titikakhir dengan nilai baru
    void setTitikakhir(titik titikakhir) {
        this.titikakhir = titikakhir;
    }

    //mengembalikan panjang garis
    double getpanjang() {
        return Math.sqrt(Math.pow(titikakhir.getAbsis() - titikawal.getAbsis(), 2) + Math.pow(titikakhir.getOrdinat() - titikawal.getOrdinat(), 2));
    }

    // mengembalikan gradient garis
    double getgradient() {
        return (titikakhir.getOrdinat() - titikawal.getOrdinat()) / (titikakhir.getAbsis() - titikawal.getAbsis());
    }

    //mengembalikan titik tengah pada garis
    titik gettitiktengah() {
        return new titik((titikawal.getAbsis() + titikakhir.getAbsis()) / 2, (titikawal.getOrdinat() + titikakhir.getOrdinat()) / 2);
    }

    //mengecek apakah garis sejajar dengan sumbu garis t
    boolean issejajar(garis g) {
        return this.getgradient() == g.getgradient();
    }

    //mengecek apakah garis tegak lurus dengan sumbu garis t
    boolean istegaklurus(garis g) {
        return this.getgradient() * g.getgradient() == -1;
    }

    //menampilkan titik awal dan titik akhir garis
    void printgaris() {
        System.out.println("titik awal garis : ");
        titikawal.printtitik();
        System.out.println("titik akhir garis : ");
        titikakhir.printtitik();
    }

    //menampilkan persamaan garis dalam bentuk string y = mx + c.
    void printpersamaan() {
        double m = getgradient();
        double c = titikawal.getOrdinat() - m * titikawal.getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }
}