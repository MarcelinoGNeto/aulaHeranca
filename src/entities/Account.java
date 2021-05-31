package entities;

public abstract class Account { //com abstract, a classe não pode ser instanciada
//Vantagens:
/*CLASSES ABSTRATAS
 * Reuso dos métodos nas subclasses;
 * Polimorfismo: a superclasse classe genérica permite tratar de forma fácil e uniforme
 * todos os tipos de conta, inclusive com polimorfismo.
 * Notação UML em itálico (nome da classe)
 * MÉTODOS ABSTRATOS:
 * São métodos que não possuem implementação
 * Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação
 * Se uma classe possuir pelo menos um método abstrato, então a classe tbm se torna abstrata
 * Notação UML em itálico (nome do método)	
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

//O setBalance está sendo removido para que a operação não seja alterada livremente, como regra do negocio
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
