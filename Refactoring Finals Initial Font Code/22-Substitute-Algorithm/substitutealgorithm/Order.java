package refactoritzacions;

public class Order {
	public float applyVAT (int vatType) {
		float result = 0;

		switch (vatType) {
			case 1:
				result = 1.04f;
				break;
			case 2:
				result = 1.18f;
				break;
			case 3:
				result = 1.21f;
				break;
			default:
				result = -1;
				break;
	}
	return result;
	}
}
