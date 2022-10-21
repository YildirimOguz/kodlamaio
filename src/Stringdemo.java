public class Stringdemo {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı: "+mesaj.length());
        System.out.println("5.eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("l"));
        char[] karekterler=new char[5];
        mesaj.getChars(0,5,karekterler,0);
        System.out.println(karekterler);
        System.out.println(mesaj.indexOf("a"));*/
        String yeniMesaj = mesaj.replace(" ","-");
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,4));
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }



    }
}
