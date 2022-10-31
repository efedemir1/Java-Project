package JavaProject;
import java.util.Scanner;

public class Hıpotenushesaplama {
    public static void main(String[] args) {
        // Değişkenlerimiiz oluşturalım.
        int a,b;
        double c,u,cevre,alan;
        // Kullanıcıdan veriler alınır.
      Scanner girdi= new Scanner(System.in);
      System.out.println("1.kenarın uzunluğunu giriniz : ");
      a=girdi.nextInt();
        System.out.println("2.kenarın uzunluğunu giriniz : ");
b=girdi.nextInt();
c= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+c);
        u=(a+b+c)/2;
        cevre=(u)*2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Çevre : "+cevre);
        System.out.println("Alan : "+alan);

    }
}
