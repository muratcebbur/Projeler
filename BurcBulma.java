import java.util.Scanner;

public class BurcBulma {

	public static void main(String[] args) {
		// hangi bur� oldu�unu bulma
		/*Ko� Burcu : 21 Mart - 20 Nisan
		Bo�a Burcu : 21 Nisan - 21 May�s
		�kizler Burcu : 22 May�s - 22 Haziran
		Yenge� Burcu : 23 Haziran - 22 Temmuz
		Aslan Burcu : 23 Temmuz - 22 A�ustos
		Ba�ak Burcu : 23 A�ustos - 22 Eyl�l
		Terazi Burcu : 23 Eyl�l - 22 Ekim
		Akrep Burcu : 23 Ekim - 21 Kas�m
		Yay Burcu : 22 Kas�m - 21 Aral�k
		O�lak Burcu : 22 Aral�k - 21 Ocak
		Kova Burcu : 22 Ocak - 19 �ubat
		Bal�k Burcu : 20 �ubat - 20 Mart */

		int day , month;
		Scanner k =new Scanner(System.in);
		System.out.println("do�du�unuz ay� giriniz");
		month =k.nextInt();
		System.out.println("do�du�unuz g�n� giriniz");
		day = k.nextInt();
		
		switch  (month) {
		case 1 :
			if(day>=1 && day<=31) {
				if (day <22 ) {
				System.out.println("o�lak");
			}else 
				System.out.println("kova");
				
			break;
			
		}	case 2:
			if(day>=1 && day<=29) {
				if (day <20 ) {
				System.out.println("kova");
			}else 
				System.out.println("bal�k");
			break;
	}
	case 3 :
		if(day>=1 && day<=31)   {
			if (day <21 ) {
			System.out.println("bal�k");
		}else 
			System.out.println("ko�");
		break;
	}	
case 4:
		if(day>=1 && day<=30) {
			if (day <21 ) {
			System.out.println("ko�");
		}else 
			System.out.println("bo�a");
		break;
		}
		case 5 :
			if(day>=1 && day<=31) {
				if (day <22 ) {
				System.out.println("bo�a");
			}else 
				System.out.println("ikizler");
			break;
		}	
		case 6:
			if(day>=1 && day<=30) {
				if (day <23 ) {
				System.out.println("ikizler");
			}else 
				System.out.println("yenge�");
			break;
			}
			case 7 :
				if(day>=1 && day<=31) {
					if (day <23 ) {
					System.out.println("yenge�");
				}else 
					System.out.println("aslan");
				break;
			}	
			case 8:
				if(day>=1 && day<=31) {
					if (day <23 ) {
					System.out.println("aslan");
				}else 
					System.out.println("ba�ak");
				break;
				}	
				case 9 :
					if(day>=1 && day<=30) {
						if (day <23 ) {
						System.out.println("ba�ak");
					}else 
						System.out.println("terazi");
					break;
				}	
				case 10:
					if(day>=1 && day<=31) {
						if (day <23 ) {
						System.out.println("terazi");
					}else 
						System.out.println("akrep");
					break;
					}		
					case 11 :
						if(day>=1 && day<=30) {
							if (day <22 ) {
							System.out.println("akrep");
						}else 
							System.out.println("yay");
						break;
					}	
					case 12:
						if(day>=1 && day<=31) 
							if (day <22 ) {
							System.out.println("yay");
						}else 
							System.out.println("o�lak");
						break;
		
		
		
		
						
		
		
		
		}
		
		
		
	}

}
