public class Main {
    public static void main(String[] args) {
    Persegi per = new Persegi("Biru", "Putih", 5);
    per.printInfo();
    per.printCounterBangunDatar();
    System.out.println("=======================================");
    Lingkaran ling = new Lingkaran("Hijau", "Hitam", 7);
    ling.printInfo();
    ling.printCounterBangunDatar();
    System.out.println("=======================================");
    BangunDatar bd = new BangunDatar(4, "merah", "hitam");
    bd.printInfo();
    bd.printCounterBangunDatar();

    }
}