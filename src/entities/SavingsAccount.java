package entities;

public class SavingsAccount extends Account { //extends: herdando da classe Account
	//trad: Poupan�a
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
//m�todos exclusivos da classe
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override //SOBREPOSI��O do m�todo da classe Account 
	public void withdraw(double amount) {
		balance -= amount;
	}

}
