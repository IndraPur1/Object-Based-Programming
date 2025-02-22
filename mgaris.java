public class mgaris {
    public static void main(String[]args){
        titik T1 = new titik(-2,0);
        titik T2 = new titik(0, 4);

        garis G1 = new garis();
        garis G2 = new garis();
        G1.setTitikawal(T1);
        G1.setTitikakhir(T2);

        System.out.println("Titik awal G1 : (" + G1.getTitikawal().getAbsis() + ", " + G1.getTitikawal().getOrdinat() + ")");
        System.out.println("Titik akhir G1 : (" + G1.getTitikakhir().getAbsis() + ", " + G1.getTitikakhir().getOrdinat() + ")");
        System.out.println("Panjang garis G1 : " + G1.getpanjang());
        System.out.println("Gradient garis G1 : " + G1.getgradient());
        System.out.println("Titik tengah garis G1 : (" + G1.gettitiktengah().getAbsis() + ", " + G1.gettitiktengah().getOrdinat() + ")");

        System.out.println("Titik awal G2 : (" + G2.getTitikawal().getAbsis() + ", " + G2.getTitikawal().getOrdinat() + ")");
        System.out.println("Titik akhir G2 : (" + G2.getTitikakhir().getAbsis() + ", " + G2.getTitikakhir().getOrdinat() + ")");
        System.out.println("Panjang garis G2 : " + G2.getpanjang());
        System.out.println("Gradient garis G2 : " + G2.getgradient());

        System.out.println("G1 sejajar dengan G2 : " + G1.issejajar(G2));
        System.out.println("G1 tegak lurus dengan G2 : " + G1.istegaklurus(G2));

        G1.printgaris();
        G2.printgaris();

        System.out.println("Jumlah garis : " + garis.getCountergaris());

        G1.printpersamaan();
        G2.printpersamaan();




    }
}
