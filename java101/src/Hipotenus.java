import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, u, alan;

        System.out.print("1. Kenar uzunluğunu giriniz (a): ");
        a = input.nextDouble();

        System.out.print("2. Kenar uzunluğunu giriniz (b): ");
        b = input.nextDouble();

        System.out.print("3. Kenar uzunluğunu giriniz (c): ");
        c = input.nextDouble();

        u = (a + b + c) / 2;

        // Alanı hesaplıyoruz: Alan = karekök(u * (u-a) * (u-b) * (u-c))

        // Karekök almak için Math.sqrt() fonksiyonunu kullanıyoruz
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Çevresi: " + (2 * u));
        System.out.println("Üçgenin Alanı: " + alan);

    }
}