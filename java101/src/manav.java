import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut_fiyat = 2.14;
        double elma_fiyat  = 3.67;
        double domates_fiyat  = 1.11;
        double muz_fiyat  = 0.95;
        double patlican_fiyat  = 5.00;

        double armut_kg, elma_kg, domates_kg, muz_kg, patlican_kg, tutar;

        System.out.print("Armut Kaç Kg : ");
        armut_kg = input.nextDouble();

        System.out.print("Elma Kaç Kg : ");
        elma_kg = input.nextDouble();

        System.out.print("Domates Kaç Kg : ");
        domates_kg = input.nextDouble();

        System.out.print("Muz Kaç Kg : ");
        muz_kg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kg : ");
        patlican_kg = input.nextDouble();

        tutar = armut_kg * armut_fiyat;
        tutar += elma_kg * elma_fiyat;
        tutar += domates_kg * domates_fiyat;
        tutar += muz_kg * muz_fiyat;
        tutar += patlican_kg * patlican_fiyat;

        System.out.println("Toplam Tutar : " +tutar);

    }
}
