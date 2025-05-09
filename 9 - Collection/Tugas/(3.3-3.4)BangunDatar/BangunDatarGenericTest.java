public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran L = new Lingkaran(7);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(L);
        System.out.println("tipe generic: " + bdg.get(). getClass().getName());
        System.out.println("Keliling Lingkaran: " + bdg.hitungKeliling());
        System.out.println("Luas Lingkaran: " + bdg.hitungLuas());

        Persegi P = new Persegi(5);
        BangunDatarGeneric<Persegi> psg = new BangunDatarGeneric<Persegi>();
        psg.set(P);
        System.out.println("tipe generic: " + psg.get(). getClass().getName());
        System.out.println("Keliling Persegi: " + psg.hitungKeliling());
        System.out.println("Luas Persegi: " + psg.hitungLuas());

        PersegiPanjang PP = new PersegiPanjang(3, 4);
        BangunDatarGeneric<PersegiPanjang> pp = new BangunDatarGeneric<PersegiPanjang>();
        pp.set(PP);
        System.out.println("tipe generic: " + pp.get(). getClass().getName());
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());

        Segitiga S = new Segitiga(7,8,9,6);
        BangunDatarGeneric<Segitiga> sg = new BangunDatarGeneric<Segitiga>();
        sg.set(S);
        System.out.println("tipe generic: " + sg.get(). getClass().getName());
        System.out.println("Keliling Persegi Panjang: " + sg.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + sg.hitungLuas());
    }
}
