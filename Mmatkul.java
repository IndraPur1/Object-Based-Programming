public class Mmatkul {
    public static void main(String[]args){
        MataKuliah MK1 = new MataKuliah("MK001", "Struktur Data", 4);
        System.out.println(MK1.getIdMatkul());
        System.out.println(MK1.getMatkul());
        MK1.setIdMatkul("MK002");
        MK1.setMatkul("Pemrograman Java");
        System.out.println(MK1.PrintMatkul());
    }
}
