package ReplitSorulari;

import java.util.LinkedList;

public class collection7 {
    public static void main(String[] args) {
//bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.
//
//LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
//
//elemandan itibaren yazdıralım.

        LinkedList<String> elemanlari = new LinkedList<String>();
        elemanlari.add("sari");
        elemanlari.add("beyaz");
        elemanlari.add("mavi");
        elemanlari.add("yesil");
        elemanlari.add("turuncu");
        for (int i = 1; i < elemanlari.size() ; i++) {
            System.out.println(elemanlari.get(i));

        }

    }
}
