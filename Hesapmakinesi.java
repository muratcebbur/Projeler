import java.util.Scanner;

public class Hesapmakinesi {

	public static void main(String[] args) {
		// hesap makinesi
		int s1 , s2 , toplam = 0 , islem;
		
		Scanner k =new Scanner(System.in);
		System.out.println("ilk sayýyý giriniz");
		s1 =k.nextInt();
		System.out.println("ikinci sayýyý giriniz");
		s2= k.nextInt();
		System.out.println("yapmak istediðiniz iþlemi seçiniz");
		System.out.println(" 1=toplama\n 2=çýkarma\n 3=çarpma\n 4=bölme");
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
			System.out.println("Hatalý iþlem seçtiniz lütfen tekran deneyiniz");
		
		
		}
		System.out.println("iþlem sonucunuz : " +toplam);
		

	}

}
