package entities;

public abstract class Account { //com abstract, a classe n�o pode ser instanciada
//Vantagens:
/*CLASSES ABSTRATAS
 * Reuso dos m�todos nas subclasses;
 * Polimorfismo: a superclasse classe gen�rica permite tratar de forma f�cil e uniforme
 * todos os tipos de conta, inclusive com polimorfismo.
 * Nota��o UML em it�lico (nome da classe)
 * M�TODOS ABSTRATOS:
 * S�o m�todos que n�o possuem implementa��o
 * M�todos precisam ser abstratos quando a classe � gen�rica demais para conter sua implementa��o
 * Se uma classe possuir pelo menos um m�todo abstrato, ent�o a classe tbm se torna abstrata
 * Nota��o UML em it�lico (nome do m�todo)	
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
