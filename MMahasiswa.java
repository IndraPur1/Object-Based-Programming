public class MMahasiswa {
    public static void main(String[]args){
        MataKuliah PBO = new MataKuliah ("PBO", "Pemrograman Berorientasi Objek", 3 );
        MataKuliah MBD = new MataKuliah ("MBD", "Manajemen Basis Data", 3 );
        Mahasiswa Mhs = new Mahasiswa("240374528", "Santoso Tunlungagung", "informatika");
        Dosen Dsn = new Dosen("2114934", "Prof. Dr. Ir. Purwanto, M.T.", "Informatika");
        Kendaraan K1 = new Kendaraan("BK 9874 CD", "Motor");
        Mhs.setDosenWali(Dsn);
        Mhs.setKendaraan(K1);
        Mhs.addMatkul(PBO);
        Mhs.addMatkul(MBD);
        Mhs.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + Mhs.getJumlahMatkul());
        System.out.println("Jumlah SKS Kuliah: " + Mhs.getJumlahSKS());
    }
}
