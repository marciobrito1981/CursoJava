package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		double valor;
		Conta conta;

		System.out.print("Entre com o numero da Conta: ");
		numero = sc.nextInt();

		System.out.print("Entre com o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("A conta possui um deposito inicial (s/n)? ");
		char op = sc.next().charAt(0);

		if (op == 's') {

			System.out.print("Informe o valor para deposito inicial: ");
			double saldo = sc.nextDouble();
			conta = new Conta(numero, nome, saldo);

		} else {

			conta = new Conta(numero, nome);

		}
		System.out.println() ;
		System.out.println("Dados da conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("Entre com o valor para Deposito: ");
		valor = sc.nextDouble();
		conta.Deposito(valor);

		System.out.println();
		System.out.println("Dados da Conta atualizado:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Entre com o valor para Saque: ");
		valor = sc.nextDouble();
		conta.Saque(valor);

		System.out.println();
		System.out.println("Dados da Conta atualizado:");

		System.out.println(conta);

		sc.close();
	}

}
