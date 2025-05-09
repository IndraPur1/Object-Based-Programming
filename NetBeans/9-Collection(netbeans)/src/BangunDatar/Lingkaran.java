/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author asus_
 */
public class Lingkaran extends BangunDatar {
    public double jejari;
    
    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
