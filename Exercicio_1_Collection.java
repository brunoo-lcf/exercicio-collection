package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio_1_Collection {

	public static void main(String[] args) {

		List<String> listaCores = new ArrayList<String>();

		Scanner leia = new Scanner(System.in);

		for (int x = 0; x < 5; x++) {
			System.out.printf("\nEscreva a %d cor: ", x + 1);
			String cores = leia.next();
			listaCores.add(cores);
		}
		System.out.println("Lista de todas as cores: ");
		for (String listaElementos : listaCores) {

			System.out.println(listaElementos);
		}
		Collections.sort(listaCores);
		System.out.println("\nOrdenar as Cores");
		System.out.println("\n"+listaCores);
		
	}

}
