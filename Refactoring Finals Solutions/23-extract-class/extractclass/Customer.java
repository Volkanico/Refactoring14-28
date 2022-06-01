package refactoritzacions;

import java.util.Date;


public class Customer {
	private String name;
	private String dni;
	private Card card;

	
	public Customer(String name, String dni, Card card) {
		this.name = name;
		this.dni = dni;
		this.card = card;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}



}
