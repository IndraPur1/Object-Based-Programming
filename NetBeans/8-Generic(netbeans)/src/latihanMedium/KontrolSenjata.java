/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author asus_
 */
public class KontrolSenjata extends Senjata {
    Senjata senjata;
    
    public KontrolSenjata(Senjata s) {
        super(s.getBunyi());
    }
    
    public boolean isAdaPeluru(){
        return getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru) {
        super.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + getPeluru());
    }
    
    public void menembak(int jumlah){
        System.out.println("Siap Menembak " + jumlah + " kali");
        if (getPeluru() == 0){
            System.out.println("Peluru Habis");
        } else{
            for (int i = 1; i <= jumlah; i++){
                if(getPeluru() != 0){
                    System.out.println(getBunyi()+ " ");
                    setPeluru(getPeluru() - 1);
                } else{
                    System.out.println("Gagal Tembak, Peluru Habis");
                }
            }
            System.out.println("Peluru sisa: " + getPeluru());
        }
    }
    
    public String menusuk(){
        if (isMenusuk()){
            return "jleB!";
        } else{
            return"Gagal, belum pasang bayonet";                                                                                                
        } 
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}   
