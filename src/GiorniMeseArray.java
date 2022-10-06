import java.util.Scanner;

public class GiorniMeseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String meseArray[] = {"Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno","Luglio",
				"Agosto","Settembre","Ottobre","Novembre","Dicembre"};
		
		int giorniMese[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.print("Inserire il numero del mese:");
		int n = sc.nextInt();
		
		if(n <= 12) {
		System.out.println("Hai inserito il numero "+n);
		System.out.println("Mese "+meseArray[n-1]);
		System.out.println("Gironi "+giorniMese[n-1]);
		}else {
			System.out.println("Devi inserito il numero compreso tra minore o uguale a 12");
		}
	}

}
