package entities;

public class Account {
	
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

//O setBalance está sendo removido para que a operação não seja alterada livremente, como regra do negocio
/*	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
*/	
//Para suprir o setBalance:
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

}
