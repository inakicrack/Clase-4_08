// Autor: Juan Carlos Caso Alonso
// Fecha: 4 de Agosto de 2021
// Para ir ejecutando pruebas y ver como funciona el codigo

import MisExcepciones.DetectadoValorNegativoException;

public class Pruebas {
    
	private static void mostrarColeccion(Elemento col[], String mensaje) {
		System.out.println("\n" + mensaje + ":\n");
		for (Elemento e: col) {
			System.out.println(e);
		}
	}
	
	public static void prueba1() {
        Elemento coleccion1[] = new Elemento[5];
		
		coleccion1[0] = new ElementoSumable(7);
		coleccion1[1] = new ElementoSumable(2);
		coleccion1[2] = new ElementoRestable(5);
		coleccion1[3] = new ElementoMultiplicador(10);
		coleccion1[4] = new ElementoDivisible(3);
		
		Elemento coleccion2[]  = {
			new ElementoDivisible(13), 
			new ElementoMultiplicador(21),
			new ElementoSumable(3),
			new ElementoRestable(3),
			new ElementoSumable(0)
		};
		mostrarColeccion(coleccion1, "Mostrando la colección 1");
		mostrarColeccion(coleccion2, "Mostrando la colección 2");
		for (int i = 0; i < coleccion1.length; i++) {
			coleccion1[i].operar(coleccion2[i]);
		}
		mostrarColeccion(coleccion1, "Mostrando la colección 1 después de operar");
	}
	
	public static void prueba2() {
        Elemento coleccion1[] = new Elemento[5];
		
		coleccion1[0] = new ElementoSumable(7);
		coleccion1[1] = new ElementoSumable(2);
		coleccion1[2] = new ElementoRestable(5);
		coleccion1[3] = new ElementoMultiplicador(10);
		coleccion1[4] = new ElementoDivisible(3);
		
		Elemento coleccion2[]  = {
			new ElementoDivisible(13), 
			new ElementoMultiplicador(21),
			new ElementoSumable(9),
			new ElementoRestable(3),
			new ElementoSumable(0)
		};
		mostrarColeccion(coleccion1, "Mostrando la colección 1");
		mostrarColeccion(coleccion2, "Mostrando la colección 2");
		for (int i = 0; i < coleccion1.length; i++) {
			try {
				coleccion1[i].operar(coleccion2[i]);
			} catch (DetectadoValorNegativoException e ) {
				System.out.println (e.getMessage());
			}
		}
		mostrarColeccion(coleccion1, "Mostrando la colección 1 después de operar");
	}
	
	public static void main(String[] args) {
		System.out.println("\n**************************************************************\n");
		System.out.println("**      El elemento 3 no genera problemas        *************\n");
		System.out.println("\n**************************************************************\n");
		prueba1();
		
		System.out.println("\n**************************************************************\n");
		System.out.println("**      El elemento 3 SI genera problemas        *************\n");
		System.out.println("\n**************************************************************\n");
		prueba2();
	}

}
