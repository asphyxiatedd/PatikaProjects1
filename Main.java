import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        b = input.nextInt();
        System.out.print("3. Sayıyı Giriniz: ");
        c = input.nextInt();

        if (a <= b && b <= c) {
            System.out.println("Sıralama: " + a + " <= " + b + " <= " + c);
        } else if (a <= c && c <= b) {
            System.out.println("Sıralama: " + a + " <= " + c + " <= " + b);
        } else if (b <= a && a <= c) {
            System.out.println("Sıralama: " + b + " <= " + a + " <= " + c);
        } else if (b <= c && c <= a) {
            System.out.println("Sıralama: " + b + " <= " + c + " <= " + a);
        } else if (c <= a && a <= b) {
            System.out.println("Sıralama: " + c + " <= " + a + " <= " + b);
        } else {
            System.out.println("Sıralama: " + c + " <= " + b + " <= " + a);
        }
    }

        }

















