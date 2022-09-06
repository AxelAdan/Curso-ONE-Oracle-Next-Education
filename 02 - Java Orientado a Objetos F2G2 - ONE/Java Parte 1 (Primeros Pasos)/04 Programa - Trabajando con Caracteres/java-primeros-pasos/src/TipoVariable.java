
public class TipoVariable {

	public static void main(String[] args) {
		// Int
		int edad = 17;
		
		System.out.println(edad);
		
		edad = edad + 5;
		
		System.out.println("Mi edad es de " + edad + " años.");
		
		// Double
		double salario = 1250.56;		
		double salarioMitad = salario / 2 ;
		
		System.out.println("La mitad del salario es " + salarioMitad); 
		
		// Cast of numbers
		double numeroUno = 230.89;
		int numeroDos = (int) numeroUno;
		
		System.out.println(numeroDos);
		
		// Long
		long numeroLargo = 122222222222L;
		
		System.out.println(numeroLargo);
		
		// Short
		short numeroCorto = 13555;
		
		System.out.println(numeroCorto);
		
		// Byte
		byte numeroPequenio = 15;
		
		System.out.println(numeroPequenio);
		
		// Float
		float numeroDecimalPequenio = 2.5F;
		
		System.out.println(numeroDecimalPequenio);
	}

}
