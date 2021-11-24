import java.util.Scanner;

public class BurcBulma {

	public static void main(String[] args) {
		// hangi burç olduğunu bulma
		/*Koç Burcu : 21 Mart - 20 Nisan
		Boğa Burcu : 21 Nisan - 21 Mayıs
		İkizler Burcu : 22 Mayıs - 22 Haziran
		Yengeç Burcu : 23 Haziran - 22 Temmuz
		Aslan Burcu : 23 Temmuz - 22 Ağustos
		Başak Burcu : 23 Ağustos - 22 Eylül
		Terazi Burcu : 23 Eylül - 22 Ekim
		Akrep Burcu : 23 Ekim - 21 Kasım
		Yay Burcu : 22 Kasım - 21 Aralık
		Oğlak Burcu : 22 Aralık - 21 Ocak
		Kova Burcu : 22 Ocak - 19 Şubat
		Balık Burcu : 20 Şubat - 20 Mart */

		int day , month;
		Scanner k =new Scanner(System.in);
		System.out.println("doğduğunuz ayı giriniz");
		month =k.nextInt();
		System.out.println("doğduğunuz günü giriniz");
		day = k.nextInt();
		
		switch  (month) {
		case 1 :
			if(day>=1 && day<=31) {
				if (day <22 ) {
				System.out.println("oğlak");
			}else 
				System.out.println("kova");
			}else
				System.out.println("geçersiz giriş");
			{
				
			break;
			
		}	case 2:
			if(day>=1 && day<=29) {
				if (day <20 ) {
				System.out.println("kova");
			}else 
				System.out.println("balık");
			}else
				System.out.println("geçersiz giriş");
			{
			break;
	}
	case 3 :
		if(day>=1 && day<=31)   {
			if (day <21 ) {
			System.out.println("balık");
		}else 
			System.out.println("koç");
		}else
			System.out.println("geçersiz giriş");
		{
		break;
	}	
case 4:
		if(day>=1 && day<=30) {
			if (day <21 ) {
			System.out.println("koç");
		}else 
			System.out.println("boğa");
		}else
			System.out.println("geçersiz giriş");
		{
		break;
		}
		case 5 :
			if(day>=1 && day<=31) {
				if (day <22 ) {
				System.out.println("boğa");
			}else 
				System.out.println("ikizler");
			}else
				System.out.println("geçersiz giriş");
			{
			break;
		}	
		case 6:
			if(day>=1 && day<=30) {
				if (day <23 ) {
				System.out.println("ikizler");
			}else 
				System.out.println("yengeç");
			}else
				System.out.println("geçersiz giriş");
			{
			break;
			}
			case 7 :
				if(day>=1 && day<=31) {
					if (day <23 ) {
					System.out.println("yengeç");
				}else 
					System.out.println("aslan");
				}else
					System.out.println("geçersiz giriş");
				{
				break;
			}	
			case 8:
				if(day>=1 && day<=31) {
					if (day <23 ) {
					System.out.println("aslan");
				}else 
					System.out.println("başak");
				}else
					System.out.println("geçersiz giriş");
				{
				break;
				}	
				case 9 :
					if(day>=1 && day<=30) {
						if (day <23 ) {
						System.out.println("başak");
					}else 
						System.out.println("terazi");
					}else
						System.out.println("geçersiz giriş");
					{
					break;
				}	
				case 10:
					if(day>=1 && day<=31) {
						if (day <23 ) {
						System.out.println("terazi");
					}else 
						System.out.println("akrep");
					}else
						System.out.println("geçersiz giriş");
					{
					break;
					}		
					case 11 :
						if(day>=1 && day<=30) {
							if (day <22 ) {
							System.out.println("akrep");
						}else 
							System.out.println("yay");
						}else
							System.out.println("geçersiz giriş");
						{
						break;
					}	
					case 12:
						if(day>=1 && day<=31) {
							if (day <22 ) {
							System.out.println("yay");
						}else 
							System.out.println("oğlak");
							}else
							System.out.println("geçersiz giriş");
		
						break;
		}
	  
		
	}

}
