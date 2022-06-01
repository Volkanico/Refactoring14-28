package XXX.refactorings.replaceconditionalwithpolymorphism;

public abstract class Vehicle {



	protected int speed;
	protected int acceleration;

	public Vehicle( int speed, int acceleration) {
		this.speed = speed;
		this.acceleration = acceleration;
	}

	public abstract int move();

	/*

	private static final int CAR = 0;
	private static final int BIKE = 1;
	private static final int PLANE = 2;

	public int move () {
		  int result = 0;
		  switch (vehicleType) {
		    case CAR:
		              result = speed * acceleration * 5;
		              break;
		    case BIKE:
		              result = speed * 10;
		              break;
		    case PLANE:
		              result = acceleration * 2;
		              break;
		  }
		  return result;
		}
		*/
}
