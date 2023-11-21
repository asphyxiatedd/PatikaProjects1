import java.math.MathContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Kilo (kg) / Boy(m) * Boy(m)
        //Çıktısı
        //Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        //Lütfen kilonuzu giriniz : 105
        //Vücut Kitle İndeksiniz : 35.49215792320173
        double kg ;
        double m;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
         m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
         kg= input.nextInt();
         double endeks = kg / (m*m);
        System.out.println("Vucut Kitle Endeksiniz : " + endeks);










            }
}
