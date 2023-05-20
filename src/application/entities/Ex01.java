package application.entities;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {	
	
	private int N;

	public Ex01() {
		
	}
	public Ex01(int n) {
		N = n;
	}

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}
	public void calculo01(){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Fazer um programa para ler um número inteiro, e depois dizer\n"
				+ "		se este número é negativo ou não");
		System.out.println();
		
		System.out.println("Informe o Número do exercicio 01");
		N = sc.nextInt();
		if(N >= 0) {
			System.out.println(String.format("O número %d é positivo",N));
			System.out.println
			("------------------****************--------------");
		}else {
			System.out.println(String.format("O número %d é negativo",N));
			System.out.println
			("------------------****************--------------");
			
			}
     	}
	public void calculo02() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println(" Fazer um programa para ler um número inteiro e dizer se este\n"
				+ "		 número é par ou ímpar.");
		System.out.println();
		
		System.out.println("Informe o Número do exercicio 02");
		 N = sc.nextInt();
		if(N % 2 == 0) {
			System.out.println(String.format("O número %d é Par",N));
			System.out.println
			("------------------****************--------------");
		}else {
			System.out.println(String.format("O número %d é Impar",N));
			System.out.println
			("------------------****************--------------");
			
         	}
     	}
		public void calculo03() {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			System.out.println("Leia 2 valores inteiros (A e B). Após, o programa deve mostrar \n"
					+ "		  uma mensagem \"Sao Multiplos\" ou \"Nao sao Multiplos\", indicando se os \n"
					+ "		  valores lidos são múltiplos entre si. Atenção: os números devem poder \n"
					+ "		  ser digitados emordem crescente ou decrescente");
			System.out.println();			
			int A,B,soma;
			
			System.out.println("Infome A");
			A = sc.nextInt();
			System.out.println("Infome B");
			B = sc.nextInt();
			
			
			if(A % B == 0 || B % A ==0) {
				System.out.println(String.format("O número %d é multiplo de %d",A,B));
				System.out.println("------------------****************--------------");
			}else {
				System.out.println(String.format("O número %d não é multiplo de %d",A,B));
				System.out.println
			    ("------------------****************--------------");
			}
		}
		public void calculo04() {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			System.out.println		
			 		("Leia a hora inicial e a hora final de um jogo.\n"
			 		+ "A seguir calcule a duração do jogo, sabendo que o mesmo pode\n"
			 		+ "começar em um dia e terminar em outro, tendo uma duração mínima\n"
			 		+ "de 1 hora e máxima de 24 horas.");
			System.out.println();			
			int A,B,soma;			
			System.out.println("Hora inicial");
			A = sc.nextInt();
			System.out.println("Hora termino");
			B = sc.nextInt();
			if (A >= B) {
			    soma = (B + 24) - A ;
			}else {
				soma = B - A;
			}
			System.out.println(String.format("O jogo durou %d hora(s)", soma));
			
			
		}
	
	
	
	
	}
