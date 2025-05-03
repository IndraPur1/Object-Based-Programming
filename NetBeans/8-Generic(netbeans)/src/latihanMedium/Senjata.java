/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author asus_
 */
public class Senjata {
    private String bunyi;
    protected int peluru;
    private boolean menusuk;
    
    public Senjata(String b){
        this.bunyi = b;
        this.peluru = 0;
        this.menusuk = false;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    void setBunyi(String b){
        this.bunyi = b;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    void setPeluru(int p){
        this.peluru = p;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    void setMenusuk(boolean m){
        this.menusuk = m;
    }
}
