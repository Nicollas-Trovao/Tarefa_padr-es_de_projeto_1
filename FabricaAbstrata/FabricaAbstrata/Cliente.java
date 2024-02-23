package FabricaAbstrata.FabricaAbstrata;

public class Cliente {
  
    private int NeoYens;
    private boolean possuiContrato;

    public Cliente(int NeoYens, boolean possuiContrato){
        this.NeoYens = NeoYens;
        this.possuiContrato = possuiContrato;
    }
    
    public boolean possuiContrato(){
        return possuiContrato;
    }
    
    public int NeoYens(){
        return NeoYens;
    }
}