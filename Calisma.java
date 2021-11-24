import java.util.Scanner;

public class Calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("kdv sini öðrenmek istediðiniz tutarý giriniz");
		double a =k.nextDouble();
		double kdv = 0.18;
		double kdvliFiyat;
		 kdvliFiyat = (kdv * a) + a;
		 System.out.println(kdvliFiyat);
		
	}

}
