import java.util.Scanner;

public class �stl�Say�Hesaplayan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("tabandaki say�y� giriniz");
		int a =scan.nextInt();	
		System.out.println("�st� giriniz");
		int b = scan.nextInt();
		int total=1;
		
		for( int i = 1; i<=b ;i++) {
			total *= a;
			
		}
			System.out.println(total);
				
	}

}
