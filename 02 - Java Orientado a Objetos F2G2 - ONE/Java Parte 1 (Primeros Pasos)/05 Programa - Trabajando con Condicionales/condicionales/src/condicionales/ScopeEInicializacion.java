package condicionales;

public class ScopeEInicializacion {
	public static void main (String[] args) {
		int edad = 20;
        int cantidadPersonas = 3;
        boolean acompañado;

        if (cantidadPersonas >= 2) {
            acompañado = true;
        } else {
            acompañado = false;
        }

        if (edad >= 18 || acompañado) {
        	System.out.println("Usted puede entrar, ¡Bienvenido!");
			System.out.println("Usted es menor de edad, pero esta permitido su ingreso");
        } else {
        	System.out.println("Usted no puede entrar");
        }
	}
}
