package paczka1;
public class Metody {

	Met_wprowadzanieDanych met1 = new Met_wprowadzanieDanych();
	Met_sprawdzaniePoprawnoœciNumeru met2 = new Met_sprawdzaniePoprawnoœciNumeru();
	Dane dane = new Dane();
	
	public void wprowadzDane() {
		met1.wprowadzLiczbePeseli();
		
		for(dane.zmienna=0;;dane.zmienna++) {
			met1.wprowadzPesel();
			met2.sprawdzaniePoprawnoœci();
			met2.czyPoprawny();
			met2.czyszczenie();
			
			if(dane.zmienna==(dane.liczbaPeseli-1)) {
				break;
			}
		}
			
	}
	
	
	
}
