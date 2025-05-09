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

    public double hitungLuas(){
        return bangundatar.hitungLuas();
    } 
}