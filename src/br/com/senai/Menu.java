package br.com.senai;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoDoMenu;
		do {
			System.out.println("---MENU---");
			System.out.println("1)Tabuada Do While");
			System.out.println("2)Tabuada For");
			System.out.println("3)Editar");
			System.out.println("4)Excluir");
			System.out.println("9)Sair");
			System.out.println("----------");
			System.out.print("Informe a opção desejada: ");
			opcaoDoMenu = tec.nextInt();
			
			switch(opcaoDoMenu) {
			case 1:
				System.out.println("---TABUADA DO WHILE---");
				int valor;
				int multiplicador = 0;
				System.out.print("Informe um valor: ");
				valor = tec.nextInt();
				System.out.println("");
				do {
					System.out.println(valor + " X " + multiplicador + " = " + (valor * multiplicador));
					multiplicador++;
				}
				while(multiplicador <= 10 );
				System.out.println("Deseja realizar outra operação?[S/N] ");
				opcao = tec.next();
				
				break;
			
			case 2:
				System.out.println("---TABUADA FOR---");
				int valor2;
				System.out.print("Informe o valor: ");
				valor2 = tec.nextInt();
				
				for(int i = 0; i <= 10; i++) {
					System.out.println(valor2 + " X " + i + " = "+ (i*valor2));
				}
				System.out.println("");
				System.out.println("Deseja realizar outra operação?[S/N] ");
				opcao = tec.next();
				break;
				
			case 3:
				System.out.println("---EDITAR---");
				break;
			case 4:
				System.out.println("---EXCLUIR---");
				break;
			case 9:
				opcao = "n";
				break;
			default:
				System.out.println("Opção inválida.");
			}
		} while(opcao.equalsIgnoreCase("s"));
			
		
		System.out.println("Sistema finalizado.");
	}

}

