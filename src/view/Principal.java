package view;

import controller.RestoController;

public class Principal {
	public static void main(String[] args) {
		
		RestoController rt = new RestoController(); 
		
		int divisor = 3; 
		int dividendo = 15; 
		int resto = rt.FuncaoResto(divisor, dividendo);
		System.out.println("O resto da divisão é: " + resto);
		
	}

}
