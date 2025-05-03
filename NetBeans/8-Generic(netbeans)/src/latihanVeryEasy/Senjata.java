/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author asus_
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String b){
        this.bunyi = b;
        this.peluru = 0;
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
    
    public void menembak(){
        System.out.println(getBunyi()+ " ");
        setPeluru(getPeluru() - 1);
        System.out.println("Sisa Peluru: " + getPeluru());
    }
}
