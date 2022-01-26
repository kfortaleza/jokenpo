package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		//Pedra = 1
		//Papel = 2
		//Tesoura = 3
		
		//Variáveis
		int voce;
		int computador;
		
		//Random
		Random random = new Random();
		
		//Scanner
		Scanner sc = new Scanner(System.in);

		//Iniciando jogo
		System.out.println("----------------------------");
		System.out.println("      J O K E N P O");
		System.out.println("----------------------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("----------------------------");
		System.out.println("");
		
		System.out.println("Qual a sua opção:");
		voce = sc.nextInt();
		computador = random.nextInt(3);
		
		if ( voce == 1 && computador == 1 ) {
			System.out.println("\nVocê escolheu Pedra");
			System.out.println("\nComputador escolheu Pedra");
			System.out.println("\nEmpate.");
			
		} else if ( voce == 2 && computador == 1 ) {
			System.out.println("\nVocê escolheu Papel");
			System.out.println("\nComputador escolheu Pedra");
			System.out.println("\nVocê ganhou esta.");
			
		} else if ( voce == 3 && computador == 1) {
			System.out.println("\nVocê escolheu Tesoura");
			System.out.println("\nComputador escolheu Pedra");
			System.out.println("\nO Computador ganhou esta.");
			
		} else if ( voce == 1 && computador == 2) {
			System.out.println("\nVocê escolheu Pedra");
			System.out.println("\nComputador escolheu Papel");
			System.out.println("\nO Computador ganhou esta.");
			
		} else if ( voce == 2 && computador == 2) {
			System.out.println("\nVocê escolheu Papel");
			System.out.println("\nComputador escolheu Papel");
			System.out.println("\nEmpate.");
			
		} else if ( voce == 3 && computador == 2 ) {
			System.out.println("\nVocê escolheu Tesoura");
			System.out.println("\nComputador escolheu Papel");
			System.out.println("\nVocê ganhou esta.");
			
		} else if ( voce == 1 && computador == 3 ) {
			System.out.println("\nVocê escolheu Pedra");
			System.out.println("\nComputador escolheu Tesoura");
			System.out.println("\nVocê ganhou esta.");
			
		} else if ( voce == 2 && computador == 3 ) {
			System.out.println("\nVocê escolheu Papel");
			System.out.println("\nComputador escolheu Tesoura");
			System.out.println("\nO Computador ganhou esta.");
			
		} else if ( voce == 3 && computador == 3) {
			System.out.println("\nVocê escolheu Tesoura");
			System.out.println("\nComputador escolheu Tesoura");
			System.out.println("\nEmpate.");
			
		} else if ( voce < 1 || voce > 3 ) {
			System.out.println("\nOpção inválida!");
		}		 
		
	}

}
