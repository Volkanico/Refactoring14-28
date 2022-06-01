package refactoritzacions;


public class Main {
	private CoolConversor conversor = new CoolConversor();
	
	public double convert (double amount) {
		return conversor.euroToPound(amount);
	}
}
