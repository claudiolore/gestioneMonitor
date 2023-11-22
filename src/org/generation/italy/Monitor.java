package org.generation.italy;

public class Monitor {
	//variabili del monitor (attributi)
	String colore;
	int pollici;
	int luminosità=50;
	boolean stato=false; 		//false: spento, true: acceso
	
	
	//funzionalità (metodi)
 	public void accendi() {
 		stato=true;
 	}
 	
 	
 	public void spegni() {
 		stato=false;
 	}
	
 	public void aumentaLuminosità()
 	{
 		if (luminosità<100)
 			luminosità+=10;
 	}
 	
 	public void riduciLuminosità()
 	{
 		if (luminosità>1)
 			luminosità-=1;
 	}
 	
}
