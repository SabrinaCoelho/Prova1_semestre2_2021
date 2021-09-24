package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {
	static int dist = 0;
	public static boolean verif(String teste, String convidado[]) {
		for(int i = 0; i < dist;i++) {
			if(convidado[i].equalsIgnoreCase(teste)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] convidado = new String[4];
		String teste;
		boolean key;
		for(int i = 0; i < 4;i++) {
			if(i == 0) {
				convidado[0] = in.nextLine();
				System.out.println("Adicionado!");
				dist++;
				continue;
			}
			teste = in.nextLine();
			key = verif(teste, convidado);
			while(key) {
				System.out.println("Nome já existente!");
				teste = in.nextLine();
				key = verif(teste, convidado);
			}
			convidado[i] = teste;
			System.out.println("Adicionado!");
			dist++;
		}
		in.close();
	}
}
