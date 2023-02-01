package org.lessons.animals;

public class Delfino extends Animale  implements Nuotare{


	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("iiiiiiii");
	}


	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("pesce");
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
