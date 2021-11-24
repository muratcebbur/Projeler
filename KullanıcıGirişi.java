import java.util.Scanner;

public class KullanýcýGiriþi {

	public static void main(String[] args) {
		// kullanýcý giriþi 
		String kullanici,sifre ;
		Scanner k=new Scanner(System.in);
		
		System.out.println("lütfen kullanýcý adýnýzý giriniz ");
		kullanici = k.nextLine();
		System.out.println("lütfen þifrenizi giriniz");
		sifre = k.nextLine();
		
		if (kullanici.equals ("murat") && sifre.equals("java7")){
			System.out.println("Baþarýyla giriþ yapýlmýþtýr\nHoþgeldiniz");
		}else 
			System.out.println("Hatalý kullacý adý veya þifre girdiniz tekrar deneyiz");
				
		
		

	}

}
