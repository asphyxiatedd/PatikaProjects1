import java.math.MathContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Meyveler ve KG Fiyatları
        //Armut : 2,14 TL Elma : 3,67 TL Domates : 1,11 TL Muz: 0,95 TL Patlıcan : 5,00 TL
        //Örnek Çıktı;
        //Armut Kaç Kilo ? :0
        //Elma Kaç Kilo ? :1
        //Domates Kaç Kilo ? :1
        //Muz Kaç Kilo ? :2
        //Patlıcan Kaç Kilo ? :3
        //Toplam Tutar : 21.68 TL
        double elmakg,muzkg,domateskg,armutkg,patlicankg;
        double muz = 0.95;
        double domates=1.11;
        double armut=2.14;
        double patlican=5.00;
        double elma=3.67;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac Kg Elma ? ");
        elmakg= input.nextInt();
        System.out.print("Kac Kg Muz?  ");
         muzkg= input.nextInt();
        System.out.print("Kac Kg Domates? ");
        domateskg= input.nextInt();
        System.out.print("Kac Kg Armut?");
        armutkg= input.nextInt();
        System.out.print("Kac Kg Patlican?");
        patlicankg= input.nextInt();

         double total=domateskg*domates+ armutkg*armut+elmakg*elma+patlicankg*patlican+muzkg*muz;
        System.out.println("Toplam Tutar : " +total );










            }
}
