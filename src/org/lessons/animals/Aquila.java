package org.lessons.animals;

public class Aquila extends Animale implements Volare {


	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("AAAAAA");
	}


	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("selvaggina");
	}
	
	public void faiVolare(String animale) {
		if(animale.equals(animale)){
			this.vola();
		}
	}
	
	public void vola() {
		
			System.out.println("sto volando");
		
	}
	
	
	
	

}
