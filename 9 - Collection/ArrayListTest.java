//File : ArrayListTest.java
//Deskripsi : Program penggunaan objek ArrayList sebagai Collection class

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //inisialisasi ArrayList yang hanya dapat berisi objek String
        //berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        //menambah elemen
        strings.add("Praktikum");
        strings.add("Collection");
        strings.add("dan Geberics");
        //menghapus elemen
        strings.remove("Praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}
