public class Arrays {
    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0]="Oğuzhan";
        ogrenciler[1]="Ali";
        ogrenciler[2]="Kağan";
        ogrenciler[3]="Ahmet";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("**************");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
