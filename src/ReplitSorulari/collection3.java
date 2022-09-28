package ReplitSorulari;

import java.util.ArrayList;

public class collection3 {
    //Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
    //
    //ArrayList elemanları: beyaz,siyah,sari,kirmizi,turuncu
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("beyaz");
        list.add("siyah");
        list.add("sari");
        list.add("kirmizi");
        list.add("turuncu");
        System.out.println("Arrayin 1. elemani:"+list.get(0)+"\n"+"Arrayin 3. elemani:"+list.get(2));
    }
}
