import java.util.Scanner;

public class Kullan�c�Giri�i {

	public static void main(String[] args) {
		// kullan�c� giri�i 
		String kullanici,sifre ;
		Scanner k=new Scanner(System.in);
		
		System.out.println("l�tfen kullan�c� ad�n�z� giriniz ");
		kullanici = k.nextLine();
		System.out.println("l�tfen �ifrenizi giriniz");
		sifre = k.nextLine();
		
		if (kullanici.equals ("murat") && sifre.equals("java7")){
			System.out.println("Ba�ar�yla giri� yap�lm��t�r\nHo�geldiniz");
		}else 
			System.out.println("Hatal� kullac� ad� veya �ifre girdiniz tekrar deneyiz");
				
		
		

	}

}
