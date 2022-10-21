public class ReCapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.1,2.2,3.3,4.4,5.5,6.6};
        double total = 0;
        double maxNumber = myList[0];
        for (Double number:myList){
            if (maxNumber<number){
                maxNumber=number;
            }
            total=total+number;
            System.out.println(number);
        }
        System.out.println("Toplam: " + total);
        System.out.println("En büyük: " + maxNumber);
    }
}
