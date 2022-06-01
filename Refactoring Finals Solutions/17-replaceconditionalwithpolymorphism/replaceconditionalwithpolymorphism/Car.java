package XXX.refactorings.replaceconditionalwithpolymorphism;

public class Car extends  Vehicle {
    public Car(int speed, int acceleration) {
        super(speed, acceleration);
    }

    @Override
    public int move(){
        return speed * 14;
    }
}
