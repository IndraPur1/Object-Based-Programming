public class ContohMetodeGenerik {
    public static void main(String[] args) {
        Anjing a = new Anjing("miki");
        Datum<Anabul> x = new Datum<>();
        x.setIsi(a);
        x.getIsi().Gerak();
        x.getIsi().Bersuara();

    }
}
