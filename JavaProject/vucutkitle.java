package JavaProject;

import java.util.Scanner;

public class vucutkitle {
    public static void main(String[] args) {
double kg,m,indeks;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz : ");
   kg=inp.nextDouble();
   System.out.println("Lütfen boyunuzu (m) cinsinden giriniz : ");
    m=inp.nextDouble();
        indeks =kg / (m*m);
    System.out.println("Vücüt Kütle İndeksiniz : " + indeks);
    }
}
