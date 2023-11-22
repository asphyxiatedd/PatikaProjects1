import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk Sayiyi Giriniz: ");
        n1 = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        n2 = input.nextInt();
        System.out.println("Yapmak istediginiz islemi secin");
        System.out.println("Toplama icin 1\nCıkartma İcin 2\nBolme İcin 3\nCarpma İcin 4");
        select = input.nextInt();

        switch (select) {
            case 1:
                sonuc = n2 + n1;
                System.out.println("Sonuc: " + sonuc);
                break;
            case 2:
                sonuc = n1 - n2;
                System.out.println("Sonuc: " + sonuc);
                break;
            case 3:
                if (n2 != 0) {
                    sonuc = n1 / n2;
                    System.out.println("Sonuc: " + sonuc);
                } else {
                    System.out.println("Sıfıra Bölüm Yapamazsınız");
                }
                break;
            case 4:
                sonuc = n1 * n2;
                System.out.println("Sonuc: " + sonuc);
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız! Tekrar Deneyiniz");

        }
    }
}
