package paczka1;
import java.util.Scanner;
public class Met_wprowadzanieDanych {

	Dane dane = new Dane();
	Scanner scan = new Scanner(System.in);
	
	public void wprowadzLiczbePeseli() {
		System.out.println("Podaj liczbe wprowadzanych numer�w Pesel");
		for(;;) {
			dane.liczbaPeseli = scan.nextInt(); 
			if(dane.liczbaPeseli<=100&&dane.liczbaPeseli>0) {
				break;
			}
			else {
				System.out.println("wprowadzono z�� liczbe, spr�buj ponownie");
			}
		}
		
	}
	public void wprowadzPesel() {
		System.out.println("wprowadz numer pesel/nr " + dane.zmienna);
		for(;;) {
			dane.Pesel[dane.zmienna] = scan.next();
			if(dane.Pesel[dane.zmienna].length()==11) {
				break;
			}
			else {
				System.out.println("wprowadzpno za kr�tki/d�ugi pesel");
				System.out.println("Podaj pesel jeszcze raz");
			}
		}
	}
}
