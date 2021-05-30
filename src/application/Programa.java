package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Programa {

	public static void main(String[] args) {

//SOBREPOSI��O
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 5000.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
// CONCEITOS EM HERAN�A:
/* 
 * Rela��o: "� um", ex: AccountBusiness � uma Conta
 * Generaliza��o/Especializa��o: A classe Account � uma conta gen�rica, a classe BusinessAccount � uma conta espec�fica
 * Superclasse(classe base): Classe Account
 * Subclasse (classe derivada): Classe BusinessAccount
 * Heran�a/Extens�o: A classe BusinessAccount extende a classe Account 
 tem tudo que a classe account tem e ainda extende outras fun��es
 * Heran�a � uma associa��o entre classes (e n�o entre objetos)
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
