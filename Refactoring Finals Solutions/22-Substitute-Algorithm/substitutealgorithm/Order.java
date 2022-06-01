package refactoritzacions;

public class Order {
	public float applyVAT (int vatType) throws Exception {
		float[] result = {1.04f, 1.18f, 1.21f};

		if (vatType >= 0 && vatType < result.length)
			throw new Exception("Tipus d'IVA erroni");

			return result[vatType];


	}
}
