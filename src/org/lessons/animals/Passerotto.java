package org.lessons.animals;

public class Passerotto extends Animale implements Movimento {


	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("cip cip");
	}


	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("mais");
	}
	
	public void faiVolare(String animale) {
		System.out.println("questo animale vola");
	}
	
	public void faiNuotare(String animale) {
		System.out.println("questo animale nuota");
	}

}