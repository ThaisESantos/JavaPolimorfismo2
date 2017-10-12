package PoliSobrecarga;

public class Cachorro extends Lobo {
	
	@Override
	
	public void emitirSom(){
		System.out.println("au! au! au");
	}
	
	public void reagir(String frase){
		if(frase == "oooi"){
				System.out.println("abanar e latir");
		}else {
			System.out.println("rosnar");
		}
	}
	
	public void reagir(int hora){
		if (hora <= 12){
			System.out.println("ficar feliz");
		}else {
			System.out.println("latir");
		}
		
	}
	
	public void reagir(boolean dono){
		if(dono == true){
			System.out.println("au au amo vc!");
		}else {
			System.out.println("so gosto de vc");
		}
		
	}
	
	public void reagir(int idade, float peso){
		
		
	}

}
