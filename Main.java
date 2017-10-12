package PoliSobrecarga;

public class Main {

	public static void main(String[] args) {
			
		Cachorro x = new Cachorro();
		x.emitirSom();
		x.reagir(18);
		x.reagir(true);
		x.reagir("oooi");
		
	}

}
