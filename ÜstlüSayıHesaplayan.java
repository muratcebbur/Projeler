import java.util.Scanner;

public class ÜstlüSayıHesaplayan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("tabandaki sayıyı giriniz");
		int a =scan.nextInt();	
		System.out.println("üstü giriniz");
		int b = scan.nextInt();
		int total=1;
		
		for( int i = 1; i<=b ;i++) {
			total *= a;
			
		}
			System.out.println(total);
				
	}

}
