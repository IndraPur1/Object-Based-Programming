/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author asus_
 */
public class BangunDatarGenericTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran L = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(L);
        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get(). getClass().getName());
    }
    
}
