public class StringMetodlar {
    public static void main(String[] args) {
        String mesaj=" Bugün hava cok güzel ";
        System.out.println(mesaj);
        System.out.println("Eleman sayisi: "+mesaj.length());
        System.out.println("5. Karakter: "+mesaj.charAt(5));
        System.out.println("metin ekleme: "+mesaj.concat("Yasasin "));
        System.out.println("bastan istenilen text var mi? :"+mesaj.startsWith("B"));
        System.out.println("sondan istenilen text var mi? :"+mesaj.endsWith("."));
        System.out.println("istenilen textin bastan indexi: "+mesaj.indexOf("av"));
        System.out.println("istenilen textin bastan indexi: "+mesaj.lastIndexOf("a"));
        System.out.println();
        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println("Texten Parca alma: "+mesaj.substring(2,6));
        for (String kelime:mesaj.split(" ")
             ) {
            System.out.println(" Kelimeler: "+kelime);

        }
        System.out.println("Kücük harf yapma: "+mesaj.toLowerCase());
        System.out.println("Kücük harf yapma: "+mesaj.toUpperCase());
        System.out.println("Bastan ve sondan bosluk atma: "+mesaj.trim());
    }
}
