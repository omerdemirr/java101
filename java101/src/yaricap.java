import java.util.Scanner;

public class yaricap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        double r, a, alan;

        System.out.println("Dairenin Yarıçapını (r) Giriniz: ");
        r = input.nextDouble();

        System.out.println("Merkez Açısının Ölçüsünü (a) Giriniz: ");
        a = input.nextDouble();

        alan = (pi * (r * r) * a) / 360;

        System.out.println("Dairenin Alanı : "+ alan);
    }
}
