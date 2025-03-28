public class MainUniversitas {
    public static void main(String[] args) {
        Fakultas teknikInformatika = new Fakultas("Teknik Informatika", 5000000, 7500000);
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "budi@gmail.com", "2025001", 1, teknikInformatika);
        Mahasiswa mahasiswa2 = new Mahasiswa("Ani", "ani@gmail.com", "2025002", 2, teknikInformatika);
        Dosen dosen1 = new Dosen("Dr. Sutisna", "sutisna@gmail.com", "D001", 5, teknikInformatika);
        Tendik tendik1 = new Tendik("Rina", "rina@gmail.com", "T001", 3);

        
        mahasiswa1.setNama("Budi Setiawan");
        dosen1.setEmail("sutisna.dr@gmail.com");
        teknikInformatika.setTarifUKT(5500000);

        System.out.println("Fakultas: " + teknikInformatika.getNamaFakultas());
        System.out.printf("Tarif UKT: Rp %,.0f\n", teknikInformatika.getTarifUKT());
        System.out.printf("Gaji Pokok: Rp %,.0f", teknikInformatika.getGajiPokok());
        System.out.println("\n");
        mahasiswa1.tampilkanInformasi();
        System.out.println("\n");
        mahasiswa2.tampilkanInformasi();
        System.out.println("\n");
        dosen1.tampilkanInformasi();
        System.out.println("\n");
        tendik1.tampilkanInformasi();
        System.out.println("\n");
        System.out.println("Total Fakultas: " + Fakultas.getCounter());
        System.out.println("Total Civitas Akademika: " + CivitasAkademika.getCounter());
        System.out.println("Total Mahasiswa: " + Mahasiswa.getCounter());
        System.out.println("Total Karyawan: " + Karyawan.getCounter());
        System.out.println("Total Dosen: " + Dosen.getCounter());
        System.out.println("Total Tendik: " + Tendik.getCounter());
    }
}