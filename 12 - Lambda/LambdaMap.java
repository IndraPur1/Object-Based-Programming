import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("9182u912", "adi");
        mahasiswaMap.put("29838113", "budi");
        mahasiswaMap.put("74856946", "baba");
        mahasiswaMap.put("12843567", "caca");

        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}
