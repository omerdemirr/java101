import java.util.Scanner;

public class Kdv {
    public static void main(String[] args)  {
        double tutar, KdvTutar, KdvDahil, KdvOran;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        if(tutar < 1000){KdvOran = 0.18;}else{KdvOran = 0.8;}

        KdvTutar = tutar * KdvOran;
        KdvDahil = KdvTutar + tutar;

        System.out.print("Kdv Dahil Fiyat: ");
        System.out.println(KdvDahil);
        System.out.print("Kdv Tutarı: ");
        System.out.println(KdvTutar);
    }
}
