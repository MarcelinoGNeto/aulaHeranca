package entities;

public class BusinessAccount extends Account { //extends define que esta classe herdar� todos os componentes da classe Account

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
//Heran�a: herdou todas as fun��es da classe Account 
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

//fun��es extras da classe BusinessAccount
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
		balance += amount;
		}
	}
	
	@Override //SOBREPOSI��O do m�todo da classe Account 
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}