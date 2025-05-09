public class MainKoleksiAnabul {
    public static void main(String[] args) {
        KoleksiGeneric<Anabul> ka = new KoleksiGeneric<>();
        ka.add(new Kucing("suci"));
        ka.add(new Anjing("snow"));
        ka.add(new Burung("flys"));

        ka.showAll();
    }
}
