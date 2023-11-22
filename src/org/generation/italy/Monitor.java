package org.generation.italy;

public class Monitor {
	//variabili del monitor (attributi)
	String colore;
	int pollici;
	int luminosita=50;
	boolean stato=false; 		//false: spento, true: acceso
	
	
	//funzionalitï¿½ (metodi)
 	public void accendi() {
 		stato=true;
 	}
 	
 	
 	public void spegni() {
 		stato=false;
 	}
	
 	public void aumentaLuminosita()
 	{
 		if (luminosita<100)
 			luminosita+=10;
 	}
 	
 	public void riduciLuminosita()
 	{
 		if (luminosita>1)
 			luminosita-=1;
 	}
 	
 	public void mostraDati()
 	{
 		System.out.println("\n\n\n\n\n\n\n\n\nQuesto è il monitor m1:");
		System.out.println("Colore: "+colore);
		System.out.println("Pollici: "+pollici);
		if (stato==true)
			System.out.println("Stato: acceso");
		else
			System.out.println("Stato: spento");
		System.out.println("Luminosita: ");
		for(int i=0;i<luminosita/10;i++)
			System.out.println("*");
		System.out.println();
 	}



}
