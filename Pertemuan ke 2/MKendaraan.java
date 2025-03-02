public class MKendaraan {
    public static void main(String[]args){
        Kendaraan K1 = new Kendaraan("B 1234 ABC", "Motor");
        System.out.println(K1.getnoPlat());
        System.out.println(K1.getjenis());
        K1.setnoPlat("H 2005 IP");
        K1.setjenis("Mobil");
        System.out.println(K1.PrintKendaraan());
    }
}
