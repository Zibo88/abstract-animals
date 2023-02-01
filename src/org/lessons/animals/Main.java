package org.lessons.animals;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner data = new Scanner(System.in);
		
		String cane = "cane";
		String delfino = "delfino";
		String passerotto = "passerotto";
		String aquila = "aquila";
		String userChoice;
		
		System.out.println("Ciao, benvenuto nell'allegra fattoria. Digita il nome di un animale per sapere di più");
		userChoice = data.nextLine().toLowerCase().trim();
		
		
	
			if(userChoice.equals(cane)) {
//				Cane
				Cane dog1 = new Cane();
				
				System.out.println("Il cane quando dorme:");
				dog1.dormi();	
				
				System.out.println("Il cane mangia:");
				dog1.mangia();
				
				System.out.println("Il verso del cane:");
				dog1.verso();
			}else if(userChoice.equals(passerotto)) {
//				Passerotto
				Passerotto passerotto1 = new Passerotto();
				
				System.out.println("\nIl passerotto quando dorme:");
				passerotto1.dormi();	
				
				System.out.println("Il passerotto mangia:");
				passerotto1.mangia();
				
				System.out.println("Il verso del passerotto:");
				passerotto1.verso();
				
				passerotto1.faiVolare(passerotto);
			}else if(userChoice.equals(aquila)){
//				Aquila
				Aquila aquila1 = new Aquila();
				System.out.println("\nl' aquila quando dorme:");
				aquila1.dormi();	
				
				System.out.println("l' aquila mangia:");
				aquila1.mangia();
				
				System.out.println("Il verso dell' aquila:");
				aquila1.verso();
				
				aquila1.faiVolare(aquila);
			}else if(userChoice.equals(delfino)) {
//				Delfino
				Delfino delfino1 = new Delfino();
				System.out.println("\nil delfino quando dorme:");
				delfino1.dormi();	
				
				System.out.println("Il delfino mangia:");
				delfino1.mangia();
				
				System.out.println("Il verso del delfino:");
				delfino1.verso();
				
				delfino1.faiNuotare(delfino);
				
				
			}else {
				System.out.println("Questo animale non appartiene alla nostra fattoria");
			}

			
			
			data.close();
			
		}
		
		

		

		
		

		
		

}
