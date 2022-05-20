package exercicios;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class SA5_Etapa2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue <String> fila = new LinkedList<String>();
		int x = 0;
		System.out.println("===========================================================");
		System.out.println("Bem vindo!");
		while (true) {
			System.out.println("===========================================================");
			System.out.println("Por favor, digite o número correspondente a sua função:");
			System.out.println("===========================================================");
			System.out.println("[1] - Para adicionar a fila");
			System.out.println("[2] - Para remover da fila");
			System.out.println("[3] - Para esvaziar a fila");
			System.out.println("[4] - Para listar elementos da fila");
			System.out.println("[5] - Para verificar se a fila esta vazia");
			System.out.println("[6] - Para sair");
			System.out.println("===========================================================");
			x = sc.nextInt();
			if (x == 1) {
				System.out.println("===========================================================");
				System.out.print("Digite o nome que deseja inserir na fila: ");
				add(fila, sc.next()); 
				}
			if (x == 2) { remove(fila); }
			if (x == 3) { limpar(fila); }
			if (x == 4) { listar(fila); }
			if (x == 5) { vazia(fila); }
			if (x == 6) { break; }
		}
		System.out.println("===========================================================");
		System.out.println("Fim do programa...");
		sc.close();
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	static void add(Queue <String> x, String y) {
		x.add(y);
		System.out.println("===========================================================");
		System.out.println(y + " foi adicionado a fila com sucesso!");
	}
	
	static void remove(Queue <String> x) {
		System.out.println("===========================================================");
		if (!x.isEmpty()) {
			System.out.println(x.poll() + " foi removido da fila com sucesso!");
		} else {
			System.out.println("Impossível remover elementos de uma fila vazia.");
		}
	}
	
	static void limpar(Queue <String> x) {
		System.out.println("===========================================================");
		if (!x.isEmpty()) {
			x.clear();
			System.out.println("A fila foi esvaziada com sucesso!");
		} else {
			System.out.println("Impossível esvaziar elementos de uma fila vazia.");
		}
	}
	
	static void listar(Queue <String> x) {
		System.out.println("===========================================================");
		if (!x.isEmpty()) {
			for (String y: x) {
				System.out.println(y);
			}
		} else {
			System.out.println("Impossível listar elementos de uma fila vazia.");
	    }
	}
	
	static void vazia(Queue <String> x) {
		System.out.println("===========================================================");
		if (!x.isEmpty()) {
			System.out.println("A fila não esta vazia!");
		} else {
			System.out.println("A fila esta vazia!");
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
