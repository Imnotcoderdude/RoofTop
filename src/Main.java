import interface_상속.lol.Champion;
import interface_상속.lol.Timo;

public class Main {
    public static void main(String[] args) {

        Champion timo = new Timo();

        timo.getQ().useSkill();
        timo.getW().useSkill();
        timo.getE().useSkill();
        timo.getR().useSkill();
    }
}