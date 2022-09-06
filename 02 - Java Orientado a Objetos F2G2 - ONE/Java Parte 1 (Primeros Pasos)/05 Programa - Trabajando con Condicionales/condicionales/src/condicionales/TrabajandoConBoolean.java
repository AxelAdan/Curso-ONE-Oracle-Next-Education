package condicionales;

public class TrabajandoConBoolean {
	public static void main (String[] args) {
		int edad = 19;
		int cantidadPersonas = 2;
		boolean esPareja = true;

		if (edad >= 18 && esPareja) {
			System.out.println("Usted puede entrar, ¡Bienvenido!");
			System.out.println("Usted es menor de edad, pero esta permitido su ingreso");
		} else {
			System.out.println("Usted no puede entrar");
		}
	}
}
