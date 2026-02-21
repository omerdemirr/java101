import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        double KmUcret = 2.20;
        double Mesafe, Tutar;
        int min = 20;

        System.out.print("Araç kaç kilometre yol aldı?:");
        Mesafe = input.nextDouble();

        Tutar = Mesafe * KmUcret;

        if(Tutar > min){
            Tutar += 10;
            System.out.println("Toplam Mesafe : " + Mesafe);
            System.out.println("Toplam Tutarınız : " + Tutar);
        }
        else{
            Tutar = min;
            System.out.println("Toplam Tutarınız : " + Tutar);
        }
    }
}

