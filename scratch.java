import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        // degisken tanımlama

        int a, b ;
        double c;

        //kullanıcıdan veri alma
        Scanner girdi = new Scanner(System.in) ;

        System.out.print("Birinci Kenari Giriniz: ");
        a = girdi.nextInt();
        System.out.print("Ikinci Kenari Giriniz: ");
        b = girdi.nextInt();
                c = Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenus : " +  c);


























    }
}