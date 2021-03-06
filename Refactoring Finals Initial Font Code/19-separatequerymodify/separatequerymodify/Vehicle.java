package refactoritzacions;


public class Vehicle {
	private int horsePower;
	private String type;

	public Vehicle(int power) {
		initVehicleAndGetType(power);
	}

	private String initVehicleAndGetType(int power) {
		horsePower = power;

		if (power >= 10) {
			type = "Truck";
		} else if (power > 5 && power < 10) {
			type = "Car";
		} else {
			type = "Bike";
		}
		
		return type;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public String getType() {
		return type;
	}
}
