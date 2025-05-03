/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantutor;

/**
 *
 * @author asus_
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    
    public Senjata(String b){
        this.bunyi = b;
        this.menusuk = false;
    }
    
    private String getBunyi(){
        return bunyi;
    }
    
    void setBunyi(String b){
        this.bunyi = b;
    }
    
    private boolean isMenusuk(){
        return menusuk;
    }
    
    void setMenusuk(boolean m){
        this.menusuk = m;
    }
    
    public void menembak(int jumlah){
        for (int i = 1; i <= jumlah; i++){
            System.out.println(getBunyi()+ " ");
        }
        System.out.println("");
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk(){
        if (isMenusuk()){
            return "jleB!";
        } else{
            return"Gagal, belum pasang bayonet";                                                                                                
        } 
    }
}
