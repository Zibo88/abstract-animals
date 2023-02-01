package org.lessons.animals;

public class Passerotto extends Animale implements Volare {


	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("cip cip");
	}

	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("mais");
	}
	
//	richiamo un metodo della stessa classe
	public void faiVolare(String animale) {
		if(animale.equals(animale)){
			this.vola();
		}
	}
	
	public void vola() {
			System.out.println("sto volando");
		
	}
	
	

}
