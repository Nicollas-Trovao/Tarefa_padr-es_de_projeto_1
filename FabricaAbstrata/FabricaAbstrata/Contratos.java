package FabricaAbstrata.FabricaAbstrata;

public class Contratos extends Fabrica {

    public Carro receberCarro(int NeoYens) {
        if (NeoYens == 65000) {
            return new Concordat(5, 4, 15, 15);
        } else {
            return null;
        }
    }
}
