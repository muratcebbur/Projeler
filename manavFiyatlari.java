import java.util.Scanner;

public class manavFiyatlari {

	public static void main(String[] args) {
		// manav �r�n fiyat hesaplama
	  /*Armut : 2,14 TL
		Elma : 3,67 TL
		Domates : 1,11 TL
		Muz: 0,95 TL
		Patl�can : 5,00 TL*/
		double armut = 2.14, elma = 3.67, domates = 1.11 , muz =0.95 , patlican = 5.0;
		
		Scanner k =new Scanner(System.in);
		System.out.print("ka� kilo armut alacaks�n�z : ");
		double a =k.nextDouble();
		System.out.print("ka� kilo elma alacaks�n�z : ");
		double e =k.nextDouble();
		System.out.print("ka� kilo domates alacaks�n�z : ");
		double d =k.nextDouble();
		System.out.print("ka� kilo muz alacaks�n�z : ");
		double m =k.nextDouble();
		System.out.print("ka� kilo patlican alacaks�n�z : ");
		double p =k.nextDouble();
		double total = (armut* a)+ (elma*e)+ (domates*d)+ (muz*m)+(patlican*p);
		System.out.println("toplam tutar�n�z : " + total);
		
		
		
		
	}

}
