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
				
				System.out.println("\nil" + " " + userChoice +" "+ "quando dorme:");
				dog1.dormi();	
				
				System.out.println("Il" + " " + userChoice + " " + "mangia:");
				dog1.mangia();
				
				System.out.println("Il verso dell':"+ " " + userChoice + " " + "è");
				dog1.verso();
				
				dog1.faiNuotare(userChoice);
			}else if(userChoice.equals(passerotto)) {
//				Passerotto
				Passerotto passerotto1 = new Passerotto();
				
				System.out.println("\nl" + " " + userChoice +" "+ "quando dorme:");
				passerotto1.dormi();	
				
				System.out.println("Il" + " " + userChoice + " " + "mangia:");
				passerotto1.mangia();
				
				System.out.println("Il verso dell':"+ " " + userChoice + " " + "è");
				passerotto1.verso();
				
				passerotto1.faiVolare(userChoice);
				
				
			}else if(userChoice.equals(aquila)){
//				Aquila
				Aquila aquila1 = new Aquila();
				System.out.println("\nl" + " " + userChoice +" "+ "quando dorme:");
				aquila1.dormi();	
				
				System.out.println("Il" + " " + userChoice + " " + "mangia:");
				aquila1.mangia();
				
				System.out.println("Il verso dell':"+ " " + userChoice + " " + "è");
				aquila1.verso();
				
				aquila1.faiVolare(userChoice);
				
				
			}else if(userChoice.equals(delfino)) {
//				Delfino
				Delfino delfino1 = new Delfino();
				System.out.println("\nil" + " " +  userChoice +" "+ "quando dorme:");
				delfino1.dormi();	
				
				System.out.println("Il" + " " + userChoice + " " + "mangia:");
				delfino1.mangia();
				
				System.out.println("Il verso del:" +" " + userChoice + " " + "è");
				delfino1.verso();
				
				delfino1.faiNuotare(userChoice);
				
				
			}else {
				System.out.println("Questo animale non appartiene alla nostra fattoria");
			}

			
			
			data.close();
			
		}
		
		

		

		
		

		
		

}
