package controller;

public class RestoController {
	
	public RestoController () {
		super ();
		
	}
	
	public int FuncaoResto (int divisor, int dividendo) {
		//condição de parada dada por conta das subtrações, já que não há mais como subtrair do dividendo
		if(dividendo<divisor) {
			return dividendo; 
		}else {
			// a função diminuindo o dividendo e chamando a si mesma 
			return FuncaoResto(divisor, dividendo - divisor);
		}
		
		
	}

}
