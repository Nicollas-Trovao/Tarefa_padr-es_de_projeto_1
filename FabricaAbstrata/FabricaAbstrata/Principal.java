package FabricaAbstrata.FabricaAbstrata;
import java.util.Scanner;

public class Principal {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à oficina Lobo de Lata... Pelo que vejo... Você possui dois Credsticks, um com 65000 NYs e outro com 25000 NYs. Qual dos dois você quer usar para comprar o carro?");

        while (true) {
            System.out.println("1 - 65000");
            System.out.println("2 - 25000");

            int res = scanner.nextInt();

            if (res == 1) {
                Cliente cliente = new Cliente(65000, true);
                Fabrica fabrica = getFabrica(cliente);
                Carro carro = fabrica.criar(cliente.NeoYens());
                carro.testeDrive();
                break;
            } else if (res == 2) {
                Cliente cliente = new Cliente(25000, false);
                Fabrica fabrica = getFabrica(cliente);
                Carro carro = fabrica.criar(cliente.NeoYens());
                carro.testeDrive();
                break;
            } else {
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
            }
        }

        scanner.close();
    }

    private static Fabrica getFabrica(Cliente cliente) {
        if (cliente.possuiContrato()) {
            return new Contratos();
        } else {
            return new Sem();
        }
    }
}
