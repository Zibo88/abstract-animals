package org.lessons.animals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cane
		Cane dog1 = new Cane();
		
		System.out.println("Il cane quando dorme:");
		dog1.dormi();	
		
		System.out.println("Il cane mangia:");
		dog1.mangia();
		
		System.out.println("Il verso del cane:");
		dog1.verso();
		
//		Passerotto
		Passerotto passerotto1 = new Passerotto();
		
		System.out.println("\nIl passerotto quando dorme:");
		passerotto1.dormi();	
		
		System.out.println("Il passerotto mangia:");
		passerotto1.mangia();
		
		System.out.println("Il verso del passerotto:");
		passerotto1.verso();
		
		passerotto1.faiVolare("passerotto");
		
		
//		Aquila
		Aquila aquila1 = new Aquila();
		System.out.println("\nl' aquila quando dorme:");
		aquila1.dormi();	
		
		System.out.println("l' aquila mangia:");
		aquila1.mangia();
		
		System.out.println("Il verso dell' aquila:");
		aquila1.verso();
		
		aquila1.faiVolare("aquila");
		
		
//		Delfino
		Delfino delfino1 = new Delfino();
		System.out.println("\nil delfino quando dorme:");
		delfino1.dormi();	
		
		System.out.println("Il delfino mangia:");
		delfino1.mangia();
		
		System.out.println("Il verso del delfino:");
		delfino1.verso();
		
		delfino1.faiNuotare("delfino");
		
		
	}

}
