package FabricaAbstrata.FabricaAbstrata;

public class Sem extends Fabrica {

    public Carro receberCarro(int NeoYens) {
        if (NeoYens == 25000) {
            return new JackRabbit(4, 3, 8, 4);
        } else {
            return null;
        }
    }
}
