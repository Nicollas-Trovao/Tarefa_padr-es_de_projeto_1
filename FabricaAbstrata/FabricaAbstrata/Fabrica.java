package FabricaAbstrata.FabricaAbstrata;

public abstract class Fabrica {

    public Carro criar(int NeoYens){
        Carro carro = receberCarro(NeoYens);
        carro = prepararCarro(carro);
        return carro;
    }

    protected Carro prepararCarro(Carro carro){
        carro.limpar();
        carro.checagem();
        return carro;
    }

    public abstract Carro receberCarro(int NeoYens);
}
