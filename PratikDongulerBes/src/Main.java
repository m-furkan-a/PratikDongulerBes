import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int sayi , ussu , toplam = 1;
	    System.out.print("Üssü Alınacak Sayıyı Giriniz : ");
	    sayi = input.nextInt();
        System.out.print("Üssü Sayısını Giriniz : ");
        ussu = input.nextInt();

        for (int i = 1 ; i <= ussu ; i++){
            toplam *= sayi ;
        }

        System.out.print(sayi + " Sayısının " + ussu + " Üssü : " + toplam);
    }
}
