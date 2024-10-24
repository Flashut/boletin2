package boletin2;

public class Clase3_32 {

	public static void main(String[] args) {

		for (int filas = 0; filas < 6; filas++) {

			for (int columnas = 0; columnas < 6; columnas++) {

				if (columnas == filas) {
					System.out.print("*");
				} else {
					System.out.print("-");

				}
			}
			System.out.println();
		}

	}

}
