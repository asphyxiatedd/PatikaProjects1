import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //𝜋 sayısını = 3.14 alınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        int r, a;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yari Capini Giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez aciyi Giriniz: ");
        a= input.nextInt();
        double formul =pi * (r*r)* a / 360 ;
        System.out.println("Daire Diliminin Alani : " + formul);










            }
}
