import java.util.Scanner;

public class manavFiyatlari {

	public static void main(String[] args) {
		// manav ürün fiyat hesaplama
	  /*Armut : 2,14 TL
		Elma : 3,67 TL
		Domates : 1,11 TL
		Muz: 0,95 TL
		Patlýcan : 5,00 TL*/
		double armut = 2.14, elma = 3.67, domates = 1.11 , muz =0.95 , patlican = 5.0;
		
		Scanner k =new Scanner(System.in);
		System.out.print("kaç kilo armut alacaksýnýz : ");
		double a =k.nextDouble();
		System.out.print("kaç kilo elma alacaksýnýz : ");
		double e =k.nextDouble();
		System.out.print("kaç kilo domates alacaksýnýz : ");
		double d =k.nextDouble();
		System.out.print("kaç kilo muz alacaksýnýz : ");
		double m =k.nextDouble();
		System.out.print("kaç kilo patlican alacaksýnýz : ");
		double p =k.nextDouble();
		double total = (armut* a)+ (elma*e)+ (domates*d)+ (muz*m)+(patlican*p);
		System.out.println("toplam tutarýnýz : " + total);
		
		
		
		
	}

}
