/* Nama File    : titik.java
 * Deskripsi    : berisi atribut dan method dalam class titik
 * Pembuat      : Indra Purwanto
 * Tanggal      : 19 februari 2025
 */

public class titik {
    // Atribut
    double absis;
    double ordinat;
    static int countertitik = 0;

    // Method
    // Konstruktor untuk membuat 
    titik() {
        absis = 0;
        ordinat = 0;
        countertitik++;
    }

    titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        countertitik++;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengembalikan nilai countertitik
    static int getCountertitik() {
        return countertitik;
    }

    // mengeset nilai absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset nilai ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // mencetak koorinat titik
    void printtitik() {
        System.out.println("(" + absis + " , " + ordinat + ")");
    }

    //mengembalikan nilai kuadran titik
    public int getquadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    //mengembalikan jarak titik ke pusat koordinat
    public double getjarakpusat() {
        return Math.sqrt(getAbsis()*getAbsis()) + (getOrdinat()*getOrdinat());
    }

    //mengembalikan jarak titik ke titik t
    public double getjarak(titik t) {
        return Math.sqrt((getAbsis()-t.getAbsis())*(getAbsis()-t.getAbsis()) + (getOrdinat()-t.getOrdinat())*(getOrdinat()-t.getOrdinat()));
    }

    //refleksi titik terhadap sumbu x
    public void refleksiX() {
        setOrdinat(getOrdinat()*-1);
    }

    //refleksi titik terhadap sumbu y
    public void refleksiY() {
        setAbsis(getAbsis()*-1);
    }

    //menghasilkan titik refleksi terhdaap x
    public double getrefleksiX() {
        return this.getOrdinat()*-1;
    }

    //menghasilkan titik refleksi terhadap y
    public double getrefleksiY() {
        return this.getAbsis()*-1;
    }
    
} // end class titik