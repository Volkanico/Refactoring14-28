package XXX.refactorings.introducenullobject;

public class NullWeapon extends Weapon {
    public NullWeapon(int damage) {
        super(damage);
    }
    @Override
    public int getDamage(){
        return 5;
    }
}
