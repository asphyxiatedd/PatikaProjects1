import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double normalTutar = mesafe * 0.10;
            double indirimOrani = 0.0;

            if (yas < 12) {
                indirimOrani = 0.50;
            } else if (yas >= 12 && yas <= 24) {
                indirimOrani = 0.10;
            } else if (yas >= 65) {
                indirimOrani = 0.30;
            }

            double indirimliTutar = normalTutar - (normalTutar * indirimOrani);

            if (yolculukTipi == 2) {
                // Gidiş Dönüş indirimi
                indirimliTutar -= indirimliTutar * 0.20;
            }

            double toplamTutar = (indirimliTutar * (yolculukTipi == 2 ? 2 : 1));

            System.out.println("İndirimsiz Tutar: " + normalTutar + " TL");
            System.out.println("Yaş İndirimi: " + (normalTutar * indirimOrani) + " TL");
            System.out.println("İndirimli Tutar: " + indirimliTutar + " TL");
            System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        } else {
            System.out.println("Hatalı veri girdiniz!");

        }
    }
}
