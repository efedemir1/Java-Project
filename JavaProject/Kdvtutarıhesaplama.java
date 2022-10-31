package JavaProject;
import java.util.Scanner;



public class Kdvtutarıhesaplama {
    public static void main(String[] args) {
       // Tutar ve Kdv oranı tanımlanır.
        double tutar, kdvOran1 = 0.18, kdvoran2=0.08, kdvTutarı, kdvliTutar ;
        // Scanner sınıfını tanımla
        Scanner inp= new Scanner(System.in);
        // Kullanıcıdan değer al
        System.out.println("Ücret tutarını giriniz : ");
        tutar=inp.nextDouble();
        boolean kdv1= (1000>tutar);
        kdvTutarı= tutar * kdvOran1;
        kdvliTutar=kdvTutarı + tutar;

        System.out.println("KDV'siz tutar : " +tutar);
        System.out.println("KDV oranı : " +kdvOran1);
        System.out.println("KDV tutarı : " +kdvTutarı);
        System.out.println("KDV'li tutar : " +kdvliTutar);
        boolean kdv2 = (tutar>1000);
        kdvTutarı= tutar * kdvoran2;
        kdvliTutar=kdvTutarı + tutar;
        System.out.println("KDV'siz tutar : " +tutar);
        System.out.println("KDV oranı : " +kdvoran2);
        System.out.println("KDV tutarı : " +kdvTutarı);
        System.out.println("KDV'li tutar : " +kdvliTutar);

    }
}
