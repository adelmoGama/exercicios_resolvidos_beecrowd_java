package iniciante_pagina_1;
import java.util.Scanner;

public class Teste_selecao {

	public static void main(String[] args) {
		System.out.print("Teste: ");
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		int C = teclado.nextInt();
		int D = teclado.nextInt();
		
		teclado.close();
		
		if(B > C && D > A && (C+D) > (A+B) && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
	}
}
