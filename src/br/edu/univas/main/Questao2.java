package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
	public static boolean nomeRepetido(String n, String nomes[]) {
		for(int i = 0; i <= nomes.length; i++) {
			for(int j = 0; j <= n.length(); j++) {
				char h1 = n.charAt(j);
				char h2 = nomes[i].charAt(j);
				if(h1 == h2) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] convidado = new String[4];
		boolean permition;
		String verif;
		for(int i = 0; i <= 2;i++) {
			if(i == 0) {
				convidado[0] = in.nextLine();
				continue;
			}
			verif = in.nextLine().toUpperCase();
			permition = nomeRepetido(verif, convidado);
			if(permition) {
				convidado[i] = verif;
			}
			else {
				System.out.println("nome reprtido detec");
			}
		}
		in.close();
	}
}
