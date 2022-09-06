public class EjerciciosTema4 {
	public static void main(String[] args)  {
		int numeroIf = -2;
		if (numeroIf == 0) {
			System.out.println("Es cero");
		} else if (numeroIf > 0) {
			System.out.println("Es positivo");
		} else if (numeroIf < 0) {
			System.out.println("Es negativo");
		}
		
		int numeroWhile = 0;
			while (numeroWhile < 3) {
			System.out.println("numero while " + numeroWhile);
			numeroWhile = numeroWhile + 1;
		  }
		int numeroDoWhile = 3;
		  do {
			System.out.println("numero do while " + numeroDoWhile);
			numeroDoWhile = numeroDoWhile +1;
		  } while(numeroDoWhile < 3);

		for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor+1){
			System.out.println("numero for " + numeroFor);
		}
		
		var estacion = "OTOÑO";
		switch(estacion) {
			case "PRIMAVERA":
				System.out.println("Es primavera");
				break;
			case "VERANO":
				System.out.println("Es verano");
				break;
			case "OTOÑO":
				System.out.println("Es otoño");
				break;
			case "INVIERNO":
				System.out.println("Es invierno");
				break;
			default:
				System.out.println("No es una estación");
		
		}
	}
}
