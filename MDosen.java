public class MDosen {
    public static void main(String[]args){
        Dosen D1 = new Dosen("19750101", "Dr. Bambang S.", "Informatika");
        System.out.println(D1.PrintDosen());
        D1.setNIP("333");
        D1.setNamaDsn("Edi");
        D1.setProdiDsn("biol");
        System.out.println(D1.getNIP());
        System.out.println(D1.getNamaDsn());
        System.out.println(D1.getProdiDsn());
    }
}
