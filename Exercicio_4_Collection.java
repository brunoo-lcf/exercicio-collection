package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_4_Collection {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> num = new HashSet<Integer>();
		
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(9);
		num.add(7);
		num.add(8);
		num.add(10);
		num.add(6);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int n = leia.nextInt();
		
		boolean verifica;
		verifica = num.contains(n);
		
		if(verifica == true) {
			System.out.println("\nOnúmero "+n+" foi encontrado!!!");	
		}else {
			System.out.println("\nO número"+n+" não foi encontrado!!!");
		}
		
	}

}
