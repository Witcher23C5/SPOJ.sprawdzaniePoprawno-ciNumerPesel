package paczka1;
public class Met_sprawdzaniePoprawno�ciNumeru {

	Dane dane = new Dane();
	
	public void sprawdzaniePoprawno�ci() {
		for(int i=0;;i++) {
			dane.suma += Integer.parseInt(dane.Pesel[dane.zmienna].substring(i,i+1))*dane.tablicaWarto�ci[i];
			//System.out.println(dane.suma);  
			if(i==10) {
				break;
			}
		}
	}
	
	public void czyPoprawny() {
		if(dane.suma%10==0&&dane.suma>0) {
			System.out.println("D");
		}
		else {
			System.out.println("N");
		}
	}
	
	//czyszczenie
	
	public void czyszczenie() {
		dane.suma = 0;
		dane.zmienna = 0;
		dane.liczbaPeseli = 0;
	}
}
