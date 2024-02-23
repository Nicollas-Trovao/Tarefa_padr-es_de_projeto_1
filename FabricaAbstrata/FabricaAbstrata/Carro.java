package FabricaAbstrata.FabricaAbstrata;

public abstract class Carro {
    
    int Manejo, Velocidade, Corpo, Armadura;

    public Carro(int Manejo, int Velocidade, int Corpo, int Armadura){
    this.Manejo = Manejo;
    this.Velocidade = Velocidade;
    this.Corpo = Corpo;
    this.Armadura = Armadura;
    }

    public void limpar(){
        System.out.println("Beleza Chapa... So vou dar uma enserada nesse seu possante");
    }

    public void checagem(){
        System.out.println("Fica quietinho ae... So vou aqui em baixo ver o estado das peças");
    }

    public void testeDrive(){
        System.out.println("Cara... Com uma velocidade de " +Velocidade +" e Manejo de " +Manejo +", ninguem pode te alcancer, e se fizerem, sua armadura de " +Armadura +" vai te deixar imbativel");
    }
}
