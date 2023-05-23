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

	public void calculo01() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Fazer um programa para ler um número inteiro, e depois dizer\n"
				+ "		se este número é negativo ou não");
		System.out.println();

		System.out.println("Informe o Número do exercicio 01");
		N = sc.nextInt();
		if (N >= 0) {
			System.out.println(String.format("O número %d é positivo", N));
			System.out.println();
			System.out.println(
					"---------------------------------------***************************-----------------------------------------");
			System.out.println();
		} else {
			System.out.println(String.format("O número %d é negativo", N));
			System.out.println("------------------****************--------------");

		}
	}

	public void calculo02() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(
				" Fazer um programa para ler um número inteiro e dizer se este\n" + "		 número é par ou ímpar.");
		System.out.println();

		System.out.println("Informe o Número do exercicio 02");
		N = sc.nextInt();
		if (N % 2 == 0) {
			System.out.println();
			System.out.println(String.format("O número %d é Par", N));
			System.out.println("------------------****************--------------");
			System.out.println();
		} else {
			System.out.println();
			System.out.println(String.format("O número %d é Impar", N));
			System.out.println("------------------****************--------------");
			System.out.println();

		}
	}

	public void calculo03() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Leia 2 valores inteiros (A e B). Após, o programa deve \n"
				+ "mostrar uma mensagem \"Sao Multiplos\" ou \"Nao sao\n"
				+ "Multiplos\", indicando se os valores lidos são múltiplos entre si.\n"
				+ "Atenção: os números devem poder ser digitados em\n" + "ordem crescente ou decrescente.");
		System.out.println();
		int A, B;

		System.out.println("Infome A");
		A = sc.nextInt();
		System.out.println("Infome B");
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println(String.format("O número %d é multiplo de %d", A, B));
			System.out.println("------------------****************--------------");
			System.out.println();
		} else {
			System.out.println(String.format("O número %d não é multiplo de %d", A, B));
			System.out.println("------------------****************--------------");
			System.out.println();
		}
	}

	public void calculo04() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Leia a hora inicial e a hora final de um jogo.\n"
				+ "A seguir calcule a duração do jogo, sabendo que o mesmo pode\n"
				+ "começar em um dia e terminar em outro, tendo uma duração mínima\n"
				+ "de 1 hora e máxima de 24 horas.");
		System.out.println();
		int A, B, soma = 0;
		System.out.println("Hora inicial");
		A = sc.nextInt();
		System.out.println("Hora termino");
		B = sc.nextInt();
		if (A > 24 || B > 24) {
			System.out.println("Informe uma hora válida da próxima vez");
		} else {
			if (A >= B) {
				soma = (B + 24) - A;
				System.out.println(String.format("O jogo durou %d hora(s)", soma));
			} else {
				soma = B - A;
				System.out.println(String.format("O jogo durou %d hora(s)", soma));
			}
		}
		System.out.println("------------------****************--------------");
		System.out.println();
	}

	public void calculo05() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Com base na tabela abaixo, escreva um programa que \n"
				+ "leia o código de um item e a quantidade deste item. A\n"
				+ "seguir, calcule e mostre o valor da conta a pagar.");
		System.out.println();
		int cod, quantidade;
		double totalAPagar;
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Digite o codigo do item desejado: ");
		System.out.println("COD-----ITEM-----------------PREÇO");
		System.out.println("001---Cachorro-Quente----R$4.00");
		System.out.println("002---X-SALADA--------------R$4.50");
		System.out.println("003---X_BACON---------------R$5.00");
		System.out.println("004---Torrada Simples-------R$2.00");
		System.out.println("005---Refrigerante------------R$1.50");
		System.out.println();
		cod = sc.nextInt();
		switch (cod) {
		case 1:
			System.out.println("Digite a quantidade de cachorro quente: ");
			quantidade = sc.nextInt();
			totalAPagar = quantidade * 4.00;
			System.out.println("Total : R$ " + totalAPagar);
			System.out.println();
			break;
		case 2:
			System.out.println("Digite a quantidade de X - Salada: ");
			quantidade = sc.nextInt();
			totalAPagar = quantidade * 4.50;
			System.out.println("Total : R$ " + totalAPagar);
			System.out.println();
			break;
		case 3:
			System.out.println("Digite a quantidade de X - Bacon: ");
			quantidade = sc.nextInt();
			totalAPagar = quantidade * 5.00;
			System.out.println("Total : R$ " + totalAPagar);
			System.out.println();
			break;
		case 4:
			System.out.println("Digite a quantidade de Torrada Simples: ");
			quantidade = sc.nextInt();
			totalAPagar = quantidade * 2.00;
			System.out.println("Total : R$ " + totalAPagar);
			System.out.println();
			break;
		case 5:
			System.out.println("Digite a quantidade de Refrigerante: ");
			quantidade = sc.nextInt();
			totalAPagar = quantidade * 1.50;
			System.out.println("Total : R$ " + totalAPagar);
			System.out.println();
			break;
		default:
			System.out.println("Número inválido");
			System.out.println();
			break;
		}

	}

	public void calculo06() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Você deve fazer um programa que leia um valor qualquer e \n"
				+ "apresente uma mensagem dizendo em qual dos seguintes intervalos \n"
				+ "([0,25], (25,50], (50,75], (75,100]) este valor se encontra. \n"
				+ "Obviamente se o valor não estiver em nenhum destes intervalos, \n"
				+ "deverá ser impressa a mensagem “Fora de intervalo”.");
		System.out.println();
		double num;
		System.out.println();
		System.out.println("Informe o valor desejado");
		num = sc.nextDouble();

		if (num >= 0 && num <= 25) {
			System.out.println("Intervalo (0,25]");
			System.out.println();
		} else if (num >= 25.01 && num <= 50) {
			System.out.println("Intervalo (25,50]");
			System.out.println();
		} else if (num >= 50.01 && num <= 75) {
			System.out.println("Intervalo (50,75]");
			System.out.println();
		} else if (num >= 75.01 && num <= 100) {
			System.out.println("Intervalo (75,100]");
			System.out.println();
		} else {
			System.out.println("Fora de intervalo");
			System.out.println();
		}
	}

	public void calculo07() {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas\n"
				+ " de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o\n"
				+ "ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).\n"
				+ "Se o ponto estiver na origem, escreva a mensagem “Origem”.\n"
				+ "Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a");

		double x, y;
		System.out.println();
		System.out.println("Digite a cordenada X");
		x = sc.nextDouble();
		System.out.println("Digite a cordenada Y");
		y = sc.nextDouble();
		if (x > 0 && y > 0) {
			System.out.println("Q1");
			System.out.println();
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
			System.out.println();
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
			System.out.println();
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
			System.out.println();
		} else {
			System.out.println("Origem");
			System.out.println();
		}
	}

	public void calculo08() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes\n"
				+ " em pagar seus impostos, pois sabem que nele não existem políticos corruptos \n"
				+ "e os recursos arrecadados são utilizados em benefício da população, sem\n"
				+ "qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.\n"
				+ "Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa \n"
				+ " de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar \n"
				+ "de Imposto de Renda, segundo a tabela abaixo.\n" + "         0.00 a 2000.00        = isento\n"
				+ "         2000.01 a 3000.00  = 8%\n" + "         3000.01 a 4500.00  = 18%\n"
				+ "         acima de 4500.00    = 28%         \n"
				+ "Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre \n"
				+ "R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta\n"
				+ "de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre\n"
				+ "R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor \n"
				+ "deve ser impresso com duas casas decimais.");

		double salario;
		double soma, soma1, soma2, total, salarioBase = 2000;
		System.out.println();
		System.out.println("Digite seu salário: ");
		salario = sc.nextDouble();

		if (salario <= 2000) {
			System.out.println("Isento de impostos");
			System.out.println();
			System.out.println();
			System.out.println("----------------------------------------------------FIM---------------------------------------------------------------");
		} else if (salario > 2000 && salario <= 3000) {
			soma = (salario - salarioBase) * 0.08;
			System.out.println(
					String.format("O imposto a ser pago baseado no salário de R$%.2f é de R$%.2f", salario, soma));
			System.out.println();
			System.out.println();
			System.out.println("----------------------------------------------------FIM---------------------------------------------------------------");
		} else if (salario > 3000 && salario <= 4500) {
			soma = (1000) * 0.08;
			soma1 = (salario - 3000) * 0.18;
			total = soma + soma1;
			System.out.println(
					String.format("O imposto a ser pago baseado no salário de R$%.2f é de R$%.2f", salario, total));
			System.out.println();
			System.out.println();
			System.out.println("----------------------------------------------------FIM---------------------------------------------------------------");
		} else if (salario > 4500) {
			soma = (1000) * 0.08;
			soma1 = (1500) * 0.18;
			soma2 = (salario - 4500) * 0.28;
			total = soma + soma1 + soma2;
			System.out.println(
					String.format("O imposto a ser pago baseado no salário de R$%.2f é de R$%.2f", salario, total));
			System.out.println();
			System.out.println();
			System.out.println("----------------------------------------------------FIM---------------------------------------------------------------");
		}
		sc.close();
	}

}// fim
