package entities;

public class SavingsAccount extends Account { //extends: herdando da classe Account
	//trad: Poupança
	
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
	
//métodos exclusivos da classe
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override //SOBREPOSIÇÃO do método da classe Account 
	public void withdraw(double amount) {
		balance -= amount;
	}

}
