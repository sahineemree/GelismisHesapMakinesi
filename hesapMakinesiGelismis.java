import java.util.Scanner;

public class hesapMakinesiGelismis {

  static int toplama(int a,int b){
      int result = a+b;
      System.out.println();
      System.out.println("SONUÇ = " + result);
      return result;
  }
  static int cikarma (int a,int b){
      int result = a-b;
      System.out.println();
      System.out.println("SONUÇ = " + result);
      return result;
  }

  static int carpma (int a,int b){
      int result = a*b;
      System.out.println();
      System.out.println("SONUÇ = " +result);
      return result;
  }

  static double bolme (double a,double b){

      double result = a/b;
      System.out.println();

      if (b==0){
          System.out.println("İkinci sayı 0 olamaz !");
          return 0;
      }
      System.out.println("SONUÇ = " +result);
      return result;
  }
  static int usAlma (int a,int b){
      int result = 1;
      for (int i = 1 ; i<=b ; i++){
          result *= a;
      }
      System.out.println();
      System.out.println("SONUÇ = " + result);
      return result;
  }
static int modAlma(int a,int b){
      int result = a%b;
    System.out.println();
    System.out.println("SONUÇ = " +result);
    return result;
}
static void dikdortgen(int a,int b){
    System.out.println();
    System.out.println("Dikdörtgen Alanı = " + a*b);
    System.out.println("Dikdörtgen Çevresi = " + (a+b)*2);

}
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu = "1) Toplama İşlemi  \n" +
                "2) Çıkarma İşlemi  \n" +
                "3) Çarpma İşlemi  \n" +
                "4) Bölme İşlemi  \n" +
                "5) Üslü Sayı Hesaplama  \n" +
                "6) Mod Alma İşlemi  \n" +
                "7) Dikdörtgen Alan ve Çevre Hesaplama \n" +
                "8) Çıkış Yapma";

        System.out.println();
        System.out.println(menu);
        while (true) {


            System.out.print("Bir işlem seçiniz : ");
            int select = input.nextInt();

            if (select == 0){
                break;
            }
            if (select == 8){
                System.out.println("Çıkış yapılıyor.. Güle Güle !");
                break;
            }

            System.out.print("Birinci sayıyı giriniz : ");
            int a = input.nextInt();
            System.out.print("Birinci sayıyı giriniz : ");
            int b = input.nextInt();

                switch (select) {

                    case 1:
                        toplama(a,b);
                        break;

                    case 2:
                        cikarma(a,b);
                        break;

                    case 3:
                        carpma(a,b);
                        break;

                    case 4:

                        bolme(a, b);
                        break;

                    case 5:
                        usAlma(a,b);
                        break;

                    case 6:
                        modAlma(a,b);
                        break;

                    case 7:
                        dikdortgen(a,b);
                        break;

                    default:
                        System.out.println("Hatalı komut girdiniz !");

                        }
                }
        }
    }