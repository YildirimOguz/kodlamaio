public class RecapDemo1 {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 12;
        int sayi3 = 124;
        int max = sayi1;
        if (max<sayi2){
            max=sayi2;
        }
        if (max<sayi3){
            max=sayi3;
        }
        System.out.println("En büyük sayı: " + max);


    }
}
