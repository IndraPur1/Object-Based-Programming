/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import java.util.List;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        // Insert
        System.out.println("===Insert===");
        Mahasiswa mhs1 = new Mahasiswa(1, "Nina");
        service.add(mhs1);
        displayAll();

        // Insert lagi
        System.out.println("===Insert Lagi===");
        service.add(new Mahasiswa(2, "Rudi"));
        service.add(new Mahasiswa(3, "Beni"));
        displayAll();

        // Update
        System.out.println("===Update===");
        Mahasiswa mhsUpdate = service.getById(2);
        if (mhsUpdate != null) {
            mhsUpdate.setNama("Agus");
            service.update(mhsUpdate);
        }
        displayAll();

        // Delete
        System.out.println("===Delete===");
        service.delete(3);
        displayAll();

        // Tutup koneksi
        service.closeConnection();
    }

    private static void displayAll() {
        System.out.println("Data Mahasiswa:");
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}
