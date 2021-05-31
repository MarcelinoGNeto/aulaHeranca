package entities;

public abstract class Account { //com abstract, a classe n�o pode ser instanciada
//Vantagens:
/*
 * Reuso dos m�todos nas subclasses;
 * Polimorfismo: a superclasse classe gen�rica permite tratar de forma f�cil e uniforme
 * todos os tipos de conta, inclusive com polimorfismo.	
 */
	private Integer number;
	private String holder;
	protected Double balance; //protegido para ter acesso em outras classes
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

//O setBalance est� sendo removido para que a opera��o n�o seja alterada livremente, como regra do negocio
/*	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
*/	
//Para suprir o setBalance:
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

}
