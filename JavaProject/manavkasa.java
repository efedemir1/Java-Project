package JavaProject;

import java.util.Scanner;

public class manavkasa {
    public static void main(String[] args) {
double armut,elma,domates,muz,patlican,armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo,toplam;
Scanner inp= new Scanner(System.in);

    System.out.println("Armut Kaç Kilo : ");
    armutKilo= inp.nextDouble();
        System.out.println("Elma Kaç Kilo : ");
        elmaKilo= inp.nextDouble();
        System.out.println("Domates Kaç Kilo : ");
        domatesKilo= inp.nextDouble();
        System.out.println("Muz Kaç Kilo : ");
        muzKilo= inp.nextDouble();
        System.out.println("Patlıcan Kaç Kilo : ");
        patlicanKilo= inp.nextDouble();
        armut= 2.14*armutKilo;
        elma= 3.67 * elmaKilo;
        domates= 1.11 * domatesKilo;
        muz= 0.95 * muzKilo;
        patlican= 5.00 * patlicanKilo;
        toplam= armut + elma + domates + muz +patlican;
        System.out.print("Toplam tutar : " +toplam );
        String vStr= " TL";
        System.out.print(vStr);
        boolean kosul1 = toplam >=15;
    String sonuc1= kosul1 ? "Kampanyadan yaralanabilirsiniz" : "Kampanyadan Yararlanamazsınız";
        System.out.println(sonuc1);
    }
}
