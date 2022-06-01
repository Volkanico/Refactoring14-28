package XXX.refactorings.replaceconditionalwithpolymorphism;

public class Plane extends Vehicle {
    public Plane(int speed, int acceleration) {
        super(speed, acceleration);
    }

    @Override
    public int move(){
        return speed * 20;
    }
}
