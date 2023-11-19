 import java.util.Scanner;
public class main {
    public static void main(String[] args) {
 
    int mat, ing, fizik, biyo, kimya, muzik;
    
    Scanner inp = new Scanner(System.in);

        System.out.println("matematik notunuz: " );
        mat = inp.nextInt(); 

        System.out.println("ingilizce notunuz: " );
        ing = inp.nextInt();

        System.out.println("fizik notunuz: " );
        fizik = inp.nextInt();

        System.out.println("biyoloji notunuz: " );
        biyo = inp.nextInt();

        System.out.println("kimya notunuz: " );
        kimya = inp.nextInt();

        System.out.println("muzik notunuz: " );
        muzik = inp.nextInt();

       int toplam = mat + ing + fizik + biyo + kimya + muzik ;
       double sonuc = toplam / 6.0 ;
        System.out.println("ortalamaniz : " + sonuc); 

           String durum = sonuc >=50 ? "gectiniz!" : "kaldiniz." ;
           System.out.println(durum);

















    }
}