package br.senai.sp.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {

		double juros;
		double capital;
		double taxa;
		double tempo;
		Scanner leitor;
		
		leitor = new Scanner(System.in);
			
		System.out.print("Qual é o Capital?");
		capital = leitor.nextDouble();
		
		System.out.print("Qual é a taxa?");
		taxa = leitor.nextDouble();
		
		System.out.print("Qual o tempo?");
		tempo = leitor.nextDouble();
		
		juros = capital * taxa/100 * tempo; //J=C.i.t
		
		System.out.println("O valor de juros é:" +juros);
				
		System.out.printf("Ao final do período você terá R$%s", juros + capital);
		
	}

}