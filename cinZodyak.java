import java.util.Scanner;
public class cinZodyak {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Doğum yılınızı Giriniz: ");
        int dogumYili= input.nextInt();
        String[] zodyakListesi = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Tiger", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        int indeks = dogumYili % 12;
        String cinZodyagi = zodyakListesi[indeks];

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);




    }
}
