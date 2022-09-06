package condicionales;

public class Condicionales {
	public static void main(String[] args) {
		int edad = 17;
		int cantidadPersonas = 2;

		if (edad >= 18) {
			System.out.println("Usted puede entrar, ¡Bienvenido!");
		} else {
			if(cantidadPersonas >= 2) {
				System.out.println("Usted es menor de edad, pero esta permitido su ingreso");
			} else {
				System.out.println("Usted no puede entrar");	
			}
		}
	}
}
