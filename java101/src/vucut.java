import java.util.Scanner;

public class vucut {
    public static void main(String[] args) {

        double boy, kilo, index;

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz :");
        boy = input.nextDouble();
        System.out.println("Kilonuzu Giriniz :");
        kilo = input.nextDouble();

        index = kilo / (boy * boy);
        System.out.println("Vücut indeksiniz :"+index);
    }
}
