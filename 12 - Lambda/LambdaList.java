import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("adi");
        mahasiswaList.add("budi");
        mahasiswaList.add("radi");
        mahasiswaList.add("didi");
        
        //Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}