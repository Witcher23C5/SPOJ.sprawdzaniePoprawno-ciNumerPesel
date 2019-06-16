package paczka1;
public class Metody {

	met_wprowadzanieDanych met1 = new met_wprowadzanieDanych();
	Dane dane = new Dane();
	
	public void wprowadzDane() {
		met1.wprowadzLiczbePeseli();
		for(dane.zmienna=1;;dane.zmienna++) {
			met1.wprowadzPesel();
			if(dane.zmienna==dane.liczbaPeseli) {
				break;
			}
		}
			
	}
}
