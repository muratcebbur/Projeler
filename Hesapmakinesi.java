import java.util.Scanner;

public class Hesapmakinesi {

	public static void main(String[] args) {
		// hesap makinesi
		int s1 , s2 , toplam = 0 , islem;
		
		Scanner k =new Scanner(System.in);
		System.out.println("ilk say�y� giriniz");
		s1 =k.nextInt();
		System.out.println("ikinci say�y� giriniz");
		s2= k.nextInt();
		System.out.println("yapmak istedi�iniz i�lemi se�iniz");
		System.out.println(" 1=toplama\n 2=��karma\n 3=�arpma\n 4=b�lme");
		islem =k.nextInt();
		 
		switch (islem) {
		case 1: 
			toplam= s1 +s2 ;
			break;
		case 2:
			toplam = s1-s2;
			break;
		case 3: 
			toplam=s1*s2;
			break;
		case 4:
			toplam=s1/s2;
			break;
		default:
			System.out.println("Hatal� i�lem se�tiniz l�tfen tekran deneyiniz");
		
		
		}
		System.out.println("i�lem sonucunuz : " +toplam);
		

	}

}
