package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		System.out.println("Enter account number:");
		int numconta = sc.nextInt();
		System.out.println("Enter account holder:");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		char aux =sc.next().charAt(0);
		if (aux=='y') {
			System.out.println("Enter initial deposit value:");
			double depositoInicial= sc.nextDouble();
			conta= new Conta(numconta,nome, depositoInicial);
		}else {
			conta = new Conta(numconta, nome);
		}
		System.out.println(conta.toString());
		System.out.println("");
		System.out.println("Enter a deposit value:");
		double deposito= sc.nextDouble();
		conta.add(deposito);
		System.out.println("Updated account data:" );
		System.out.println(conta.toString());
		System.out.println("");
		System.out.println("Enter a withdraw value:");
		double saque=sc.nextDouble();
		conta.less(saque);
		System.out.println("Updated account data:" );
		System.out.println(conta.toString());
		
		sc.close();
		
	}
}
