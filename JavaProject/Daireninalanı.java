package JavaProject;
import java.util.Scanner;


public class Daireninalanı {
    public static void main(String[] args) {
        // Değişkenleri tanımla
double yariCap, pi, cevre,alan, aci;
        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını cm cinsinden giriniz : ");
        yariCap=inp.nextInt();
        System.out.println("Dairenin merkez açısını giriniz : ");
        aci=inp.nextInt();
        pi=3.14;
        cevre= 2*(pi*yariCap);
        alan=(pi*(yariCap*yariCap)*aci) / 360;
        System.out.println("Dairenin Çevresi : " +cevre);
    System.out.println("Dairenin Alanı : " +alan);
    }
}
