public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 23;
        int sayi3 = 29;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) ;
        {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En BÜYÜK = " + enBuyuk);
    }
}