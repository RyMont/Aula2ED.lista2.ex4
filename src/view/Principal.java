package view;

import controller.FatorialController;

public class Principal {
	public static void main(String[] args) {
		FatorialController fc = new FatorialController();
		
		int num = fc.recebeNum();
		int fatDuplo = fc.fatorialDuplo(num);
		System.out.print("O fatorial duplo do numero " +num +" é: " +fatDuplo);
	}
}
