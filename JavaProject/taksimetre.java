package JavaProject;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm=2.20 ,startPrice = 10, total;
        Scanner input = new Scanner(System.in);
                System.out.print("Mesafeyi km cinsinden giriniz : ");
km=input.nextInt();
         total= startPrice +(km*perKm);
        total= (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);

    }
}
