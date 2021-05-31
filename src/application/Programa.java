package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Programa {

	public static void main(String[] args) {

//CLASSES ABSTRATAS		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
// POLIMORFISMO: muitas formas, a mesma opera��o com comportamentos diferentes, conforme os objetos as quais foram aplicadas.
/*
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	
*/		
//SOBREPOSI��O
/*
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 5000.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
*/		
// CONCEITOS EM HERAN�A:
/* 
 * Rela��o: "� um", ex: AccountBusiness � uma Conta
 * Generaliza��o/Especializa��o: A classe Account � uma conta gen�rica, a classe BusinessAccount � uma conta espec�fica
 * Superclasse(classe base): Classe Account
 * Subclasse (classe derivada): Classe BusinessAccount
 * Heran�a/Extens�o: A classe BusinessAccount extende a classe Account 
 tem tudo que a classe account tem e ainda extende outras fun��es
 * Heran�a � uma associa��o entre classes (e n�o entre objetos)
 * 
 * Palavra chave: final
 * utilizada por motivo de seguran�a para impedir que alguma classe ou m�todo a heran�a
 */
/*
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING: converter objetos das subclasses na superclasse
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new BusinessAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCAST: converter objetos da superclasse nas subclasses
		BusinessAccount acc4 = (BusinessAccount)acc2; //(BusinessAccount) permite o acesso da subclasse na superclasse
		acc4.loan(100.0);
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");//trad.: Loan -> empr�stimmo
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
*/		

	}

}
