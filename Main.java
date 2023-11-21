import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Taksimetre km basi 15 , acilis 18 tl , min odeme 50 tl

        int km, acilis = 18 ;
        double perKm = 15 , total;
        Scanner input = new Scanner(System.in);

        System.out.print("Km Giriniz :");
        km= input.nextInt();
        total = (perKm * km)+acilis ;
        total = (total < 50) ? 50 : total;
        System.out.println("Tutar: " + total);














            }
}
