package entities;

public class BusinessAccount extends Account { //extends define que esta classe herdará todos os componentes da classe Account

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
//Herança: herdou todas as funções da classe Account 
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

//funções extras da classe BusinessAccount
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
	
	@Override //SOBREPOSIÇÃO do método da classe Account 
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}