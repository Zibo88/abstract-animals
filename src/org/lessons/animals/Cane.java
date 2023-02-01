package org.lessons.animals;

public class Cane extends Animale implements Nuotare {


	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("bau");
	}


	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("croccantini");
	}
	
	public void faiNuotare(String animale) {
		if(animale.equals(animale)){
			this.nuota();
		}
	}
	
	public void nuota() {
		System.out.println("sto nuotando");
	}
	

}
