/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author asus_
 */
public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangundatar;
    
    public void set(T tipebangundatar){
        bangundatar = tipebangundatar;
    }
    
    public T get(){
        return bangundatar;
    }
    
    public double hitungKeliling(){
        return bangundatar.hitungKeliling();
    }
}
