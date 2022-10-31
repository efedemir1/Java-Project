package JavaProject;
import java.util.Scanner;
public class DerslerinOrtalaması {
    public static void main(String[] args) {
        // Dersleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kullancıdan değerleri al
        System.out.println("Matematik Notunu giriniz : ");
        mat=inp.nextInt();
        System.out.println("Fizik Notunu giriniz : ");
        fizik=inp.nextInt();
        System.out.println("Kimya Notunu giriniz : ");
        kimya=inp.nextInt();
        System.out.println("Türkçe Notunu giriniz : ");
        turkce=inp.nextInt();
        System.out.println("Tarih Notunu giriniz : ");
        tarih=inp.nextInt();
        System.out.println("Muzik Notunu giriniz : ");
        muzik=inp.nextInt();
         int toplam = mat+fizik+kimya+turkce+tarih+muzik;
                 int sonuc= toplam/6;
                 boolean ortalama = sonuc>=60;
                 String durum= ortalama? "Geçtiniz":"Kaldınız";
System.out.println(sonuc);
                 System.out.print(durum);


    }



}
