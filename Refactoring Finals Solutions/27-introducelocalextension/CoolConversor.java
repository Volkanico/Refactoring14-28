package refactoritzacions;

public class CoolConversor extends Conversor {
    public double euroToPound (double qty){
        return qty * 0.89d;
    }

    public double poundToEuro (double qty){
        return qty / 0.89d;
    }

}
