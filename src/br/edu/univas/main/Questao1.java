package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {
	public static double menorDetec(double n[]) {
		double menor = n[0];
		for(int i = 1;i <= 24;i++) {
			if(n[i] < menor) {
				menor = n[i];
			}
		}
		return menor;
	}
	public static double maiorDetec(double n[]) {
		double maior = n[0];
		for(int i = 1;i <= 24;i++) {
			if(n[i] > maior) {
				maior = n[i];
			}
		}
		return maior;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] nota = new double[25];
		for(int i = 0;i <= 24;i++) {
			System.out.println("Digite a nota do "+(i + 1)+"° aluno:");
			nota[i] = in.nextDouble();
		}
		double menor = menorDetec(nota);
		double maior = maiorDetec(nota);
		System.out.println("Menor nota da prova: "+ menor);
		System.out.println("Maior nota da prova: "+ maior);
		in.close();
	}
}
