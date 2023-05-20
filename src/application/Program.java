package application;

import application.entities.Ex01;

public class Program {
	public static void main(String[] args) {
		/*(01) Fazer um programa para ler um número inteiro, e depois dizer
		se este número é negativo ou não.*/
		Ex01 exercicio = new Ex01();
		exercicio.calculo01();
		/*(02) Fazer um programa para ler um número inteiro e dizer se este
		 número é par ou ímpar.*/
		exercicio.calculo02();
		/*(03) Leia 2 valores inteiros (A e B). Após, o programa deve mostrar 
		  uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os 
		  valores lidos são múltiplos entre si. Atenção: os números devem poder 
		  ser digitados emordem crescente ou decrescente.*/
		exercicio.calculo03();
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração
		 do jogo, sabendo que o mesmo pode começar em um dia e terminar em 
		 outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		exercicio.calculo04();
		
	}

}
