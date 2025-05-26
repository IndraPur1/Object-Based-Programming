/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs?useSSL=false&serverTimezone=UTC";
                String user = "root"; // Ganti dengan username MySQL Anda
                String password = "Solodatabase455@"; // Ganti dengan password MySQL Anda
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Error koneksi: " + e.getMessage());
                throw new RuntimeException("Gagal terkoneksi ke database", e);
            }
        }
        return koneksi;
    }
}
