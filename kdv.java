import java.util.Scanner ;

public class main {

    public static void main(String[] args) {
        double tutar, kdvOran = 0.20, kdvTutar, kdvliTutar ; 
        Scanner input = new Scanner(System.in);

    System.out.print("Ucret Tutatrini Giriniz : " );
    tutar = input.nextDouble();
    kdvTutar = tutar * kdvOran;
    kdvliTutar = tutar + kdvTutar ;

    System.out.println("kdvsiz Tutar :" + tutar);
        System.out.println("kdv Orani: " + kdvOran);
        System.out.println("kdv Tutari: " + kdvTutar);
        System.out.println("kdv Dahil Fiyat: " + kdvliTutar);











    }
}