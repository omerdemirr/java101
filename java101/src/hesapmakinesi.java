import java.util.Scanner;

public class hesapmakinesi {
    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, sonuc;
        char islem;

        System.out.println("Sayı Giriniz: ");
        num1 = input.nextDouble();

        System.out.println("İşlem Seçiniz: ");
        islem = input.next().charAt(0);

        System.out.println("Sayı Giriniz: ");
        num2 = input.nextDouble();

        switch (islem) {
            case '+':
                sonuc = num1 + num2;
                System.out.println("İslemin Sonucu: "+ sonuc);
                break;

            case '-':
                sonuc = num1 - num2;
                System.out.println("İslemin Sonucu: "+ sonuc);
                break;

            case '*':
                sonuc = num1 * num2;
                System.out.println("islemin Sonucu: "+ sonuc);
                break;

            case '/':
                if(num2 == 0){
                    System.out.println("0'a bölünmez");
                }
                else{
                    sonuc = num1 / num2;
                    System.out.println("İslemin Sonucu: "+ sonuc);
                }
                break;

            default:
                System.out.println("İslem Hatası");
                break;
        }
    }
}
