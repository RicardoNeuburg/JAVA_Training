package exercicios;

import java.util.Random;

public class BubbleSort {

	static void ordemCres_Decres(int x[], boolean order) {
		int a=0;
		for (int i=0; i< x.length; i++) {
			for (int j=0; j < x.length; j++) {
				if (order) {
					if (x[i] < x[j]) {
						a=x[i];
						x[i]=x[j];
						x[j]=a;
					}
				} else {
					if (x[i] > x[j]) {
						a=x[i];
						x[i]=x[j];
						x[j]=a;
					}
				}
			}
		}
	}
	
	static void msgSaida(int x[]) {
		for(int i=0; i<x.length; i++) {
			if (i== 0) {System.out.print("[ " + x[i] + " - ");}
			if (i!= 0 && i!= x.length -1) {System.out.print(x[i] + " - ");}
			if (i == x.length - 1) {System.out.println(x[i] + " ]");}
		}
	}
	
	public static void main(String[] args) {
		int num[]= new int[10];
		Random rnd= new Random();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("Bem vindo!");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(int i=0; i<num.length; i++) {
			num[i]= rnd.nextInt(9);
		}
		System.out.println("Números aleatórios desorganizados: ");
		msgSaida(num);
		ordemCres_Decres(num, true);
		System.out.println("Ordem Crescente: (BubbleSort) ");		
		msgSaida(num);
		ordemCres_Decres(num, false);
		System.out.println("Ordem Decrescente: (BubbleSort) ");		
		msgSaida(num);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("Fim do programa...");

	}

}
