public class Pegawai {
    public String nama;
    public int gajiPokok = 5000000;

    public Pegawai(String name){
        nama = name;
    }

    String  getNama(){
        return nama;
    }

    int getgajiPokok(){
        return gajiPokok;
    }

    void setNama(String name){
        nama = name;
    }

    void tampilData(){
        System.out.println("Nama : " + getNama() + ", Gaji pokok : " + getgajiPokok());
    }


}
