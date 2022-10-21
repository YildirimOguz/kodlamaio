public class Asalsayi {
    public static void main(String[] args) {
        int sayi = 3;
        int remainder = sayi % 2;
        //System.out.println(remainder);
        boolean isPrime = true;
        if (sayi==1){
            System.out.println("Sayı asal değildir.");
            return;
        }
        for (int i=2; i<sayi;i++){
            if (sayi % i == 0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Sayı asaldır.");
        }
        else{
            System.out.println("Sayı asal değildir");
        }
    }
}
