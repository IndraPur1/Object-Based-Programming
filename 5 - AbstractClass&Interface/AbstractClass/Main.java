public class Main {
  public static void main(String[] args) {
    BangunDatar P1 = new Persegi(10, "Hitam", "Putih"); 
    Persegi P2 = new Persegi(5, "Hitam", "Putih");
    BangunDatar L1 = new Lingkaran(7, "Merah", "Putih"); 
    Lingkaran L2 = new Lingkaran (14, "Biru", "Putih");
    System.out.println(L1.isEqualLuas(P1));
  }
}
