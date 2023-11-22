import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, geo, art, tarih, ortlama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya otunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.print("Geo Notunuzu Giriniz: ");
        geo = input.nextInt();

        System.out.print("Art Notunuzu Giriniz: ");
        art = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();
        ortlama = (mat + fizik + geo + tarih + art + kimya) / 6;
        if (ortlama >= 55) {
            System.out.println("Sınıfı Geçtiniz Ortalamanız: " + ortlama);
        } else if (ortlama < 55) {
            System.out.println("Sınıfta Kaldınız Ortalamanız:" + ortlama);

        }


    }
}